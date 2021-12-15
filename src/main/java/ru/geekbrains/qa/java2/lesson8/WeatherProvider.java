package ru.geekbrains.qa.java2.lesson8;

import ru.geekbrains.qa.java2.lesson8.enums.Periods;

import java.io.IOException;

public interface WeatherProvider {

    public void getWeather(Periods period) throws IOException;
}
