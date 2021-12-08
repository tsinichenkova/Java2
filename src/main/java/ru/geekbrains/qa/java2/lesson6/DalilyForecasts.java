package ru.geekbrains.qa.java2.lesson6;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;

import java.io.*;

public class DalilyForecasts {

    private static final String BASE_HOST = "dataservice.accuweather.com";

    private static final String FORECAST = "forecasts";
    private static final String API_VERSION = "v1";
    private static final String FORECAST_TYPE = "daily";
    private static final String FORECAST_PERIOD = "5day";

    private static final String LOCATION = "locations";
    private static final String LOCATION_API_VERSION = "v1";
    private static final String LOCATION_TYPE = "cities";
    private static final String LOCATION_METHOD = "search";

    private static final String API_KEY = "zdZjGDkMvstxPVCqP0ZOcWk7I3Gxgcpy";

    public static void main(String[] args) throws IOException {

        String locationKey = getLocationKey("Санкт-Петербург");
        getForecasts(locationKey, "forecast.json");
    }

    private static void getForecasts(String locationKey, String path) throws IOException {
        OkHttpClient client = new OkHttpClient();

        HttpUrl url = new HttpUrl.Builder()
                .scheme("http")
                .host(BASE_HOST)
                .addPathSegment(FORECAST)
                .addPathSegment(API_VERSION)
                .addPathSegment(FORECAST_TYPE)
                .addPathSegment(FORECAST_PERIOD)
                .addPathSegment(locationKey)
                .addQueryParameter("apikey", API_KEY)
                .addQueryParameter("language", "ru-ru")
                .addQueryParameter("metric", "true")
                .build();

        Request requesthttp = new Request.Builder()
                .addHeader("accept", "application/json")
                .url(url)
                .build();

        String jsonResponse = client.newCall(requesthttp).execute().body().string();
        ObjectMapper mapper = new ObjectMapper();
        String jsonResponsePretty = mapper.readTree(jsonResponse).toPrettyString();
        writeFile(jsonResponsePretty, path);
    }

    private static String getLocationKey(String textForSearch) throws IOException {
        OkHttpClient client = new OkHttpClient();

        HttpUrl url = new HttpUrl.Builder()
                .scheme("http")
                .host(BASE_HOST)
                .addPathSegment(LOCATION)
                .addPathSegment(LOCATION_API_VERSION)
                .addPathSegment(LOCATION_TYPE)
                .addPathSegment(LOCATION_METHOD)
                .addQueryParameter("apikey", API_KEY)
                .addQueryParameter("language", "ru-ru")
                .addQueryParameter("q", textForSearch)
                .build();

        Request requesthttp = new Request.Builder()
                .addHeader("accept", "application/json")
                .url(url)
                .build();

        String jsonResponse = client.newCall(requesthttp).execute().body().string();
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode rootArray = objectMapper.readTree(jsonResponse).get(0);

        return rootArray.path("Key").asText();
    }

    private static void writeFile (String data, String path) {
        try (PrintWriter out = new PrintWriter(path)) {
            out.println(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
