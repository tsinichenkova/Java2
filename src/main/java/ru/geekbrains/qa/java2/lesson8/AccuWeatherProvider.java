package ru.geekbrains.qa.java2.lesson8;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.commons.lang3.StringUtils;
import ru.geekbrains.qa.java2.lesson8.entity.DailyForecast;
import ru.geekbrains.qa.java2.lesson8.entity.WeatherResponse;
import ru.geekbrains.qa.java2.lesson8.enums.Periods;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

public class AccuWeatherProvider implements WeatherProvider {

    private static final String BASE_HOST = "dataservice.accuweather.com";
    private static final String FORECAST_ENDPOINT = "forecasts";
    private static final String CURRENT_CONDITIONS_ENDPOINT = "currentconditions";
    private static final String FORECAST_TYPE = "daily";
    private static final String FORECAST_PERIOD = "5day";
    private static final String API_VERSION = "v1";
    private static final String API_KEY = ApplicationGlobalState.getInstance().getApiKey();

    private final OkHttpClient client = new OkHttpClient();
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void getWeather(Periods periods) throws IOException {
        String cityKey = detectCityKey();
        switch (periods) {
            case NOW:
                getCurrentWeather(cityKey);
                break;
            case FIVE_DAYS:
                getWeatherForFiveDays(cityKey);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + periods);
        }
    }

    private void getCurrentWeather (String cityKey) throws IOException {
        HttpUrl url = new HttpUrl.Builder()
                .scheme("http")
                .host(BASE_HOST)
                .addPathSegment(CURRENT_CONDITIONS_ENDPOINT)
                .addPathSegment(API_VERSION)
                .addPathSegment(cityKey)
                .addQueryParameter("apikey", API_KEY)
                .addQueryParameter("language", "ru-ru")
                .build();

        Request request = new Request.Builder()
                .addHeader("accept", "application/json")
                .url(url)
                .build();

        Response response = client.newCall(request).execute();
        String jsonResponse = response.body().string();

        ObjectMapper objectMapper = new ObjectMapper();
        List<WeatherResponse> weatherResponses = objectMapper.readValue(jsonResponse, new TypeReference<List<WeatherResponse>>() {});
        if (weatherResponses.size() > 0) {
            WeatherResponse weatherResponse = weatherResponses.get(0);
            System.out.printf("В городе %s %s, температура %.1f по %s\n",
                    ApplicationGlobalState.getInstance().getSelectedCity(),
                    weatherResponse.getWeatherText().toLowerCase(Locale.ROOT),
                    weatherResponse.getTemperature().getMetric().getValue(),
                    weatherResponse.getTemperature().getMetric().getUnit());
        } else {
            throw new IOException("Сервер не вернул погоду");
        }
    }

    private void getWeatherForFiveDays (String cityKey) throws IOException {
        HttpUrl url = new HttpUrl.Builder()
                .scheme("http")
                .host(BASE_HOST)
                .addPathSegment(FORECAST_ENDPOINT)
                .addPathSegment(API_VERSION)
                .addPathSegment(FORECAST_TYPE)
                .addPathSegment(FORECAST_PERIOD)
                .addPathSegment(cityKey)
                .addQueryParameter("apikey", API_KEY)
                .addQueryParameter("language", "ru-ru")
                .addQueryParameter("metric", "true")
                .build();

        Request request = new Request.Builder()
                .addHeader("accept", "application/json")
                .url(url)
                .build();

        Response response = client.newCall(request).execute();
        String jsonResponse = response.body().string();

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            WeatherResponse weatherResponses = objectMapper.readValue(jsonResponse, WeatherResponse.class);
            List<DailyForecast> dailyForecasts = weatherResponses.getDailyForecasts();
            for (DailyForecast dailyForecast : dailyForecasts) {
                System.out.printf("В городе %s на дату %s ожидается %s, минимальная температура %s %s, максимальная температура %s %s\n",
                        ApplicationGlobalState.getInstance().getSelectedCity(),
                        StringUtils.substringBefore(dailyForecast.getDate(), "T"),
                        dailyForecast.getDay().getIconPhrase().toLowerCase(),
                        dailyForecast.getTemperature().getMinimum().getValue(),
                        dailyForecast.getTemperature().getMinimum().getUnit(),
                        dailyForecast.getTemperature().getMaximum().getValue(),
                        dailyForecast.getTemperature().getMaximum().getUnit());
            }
        } catch (Exception e) {
            throw new IOException("Сервер не вернул погоду");
        }
    }

    public String detectCityKey() throws IOException {
        String selectedCity = ApplicationGlobalState.getInstance().getSelectedCity();

        HttpUrl detectLocationURL = new HttpUrl.Builder()
            .scheme("http")
            .host(BASE_HOST)
            .addPathSegment("locations")
            .addPathSegment(API_VERSION)
            .addPathSegment("cities")
            .addPathSegment("autocomplete")
            .addQueryParameter("apikey", API_KEY)
             .addQueryParameter("language", "ru-ru")
            .addQueryParameter("q", selectedCity)
            .build();

        Request request = new Request.Builder()
            .addHeader("accept", "application/json")
            .url(detectLocationURL)
            .build();

        Response response = client.newCall(request).execute();

        if (!response.isSuccessful()) {
            throw new IOException("Невозможно прочесть информацию о городе. " +
                "Код ответа сервера = " + response.code() + " тело ответа = " + response.body().string());
        }
        String jsonResponse = response.body().string();
        System.out.println("Произвожу поиск города " + selectedCity);

        if (objectMapper.readTree(jsonResponse).size() > 0) {
            String cityName = objectMapper.readTree(jsonResponse).get(0).at("/LocalizedName").asText();
            String countryName = objectMapper.readTree(jsonResponse).get(0).at("/Country/LocalizedName").asText();
            System.out.println("Найден город " + cityName + " в стране " + countryName);
        } else throw new IOException("Server returns 0 cities");

        return objectMapper.readTree(jsonResponse).get(0).at("/Key").asText();
    }
}
