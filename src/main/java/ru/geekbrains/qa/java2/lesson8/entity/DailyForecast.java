package ru.geekbrains.qa.java2.lesson8.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DailyForecast {

    @JsonProperty(value = "Date")
    String date;

    @JsonProperty(value = "Temperature")
    Temperature temperature;

    @JsonProperty(value = "Day")
    TimesOfDay day;

    @JsonProperty(value = "Night")
    TimesOfDay night;

    public DailyForecast() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    public TimesOfDay getDay() {
        return day;
    }

    public void setDay(TimesOfDay day) {
        this.day = day;
    }

    public TimesOfDay getNight() {
        return night;
    }

    public void setNight(TimesOfDay night) {
        this.night = night;
    }
}
