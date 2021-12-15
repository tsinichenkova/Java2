package ru.geekbrains.qa.java2.lesson8;

import ru.geekbrains.qa.java2.lesson8.entity.WeatherData;
import ru.geekbrains.qa.java2.lesson8.enums.Periods;

import java.io.IOException;
import java.util.List;

public interface WeatherProvider {

    public void getWeather(Periods period) throws IOException;

    List<WeatherData> getAllFromDb() throws IOException;
}
