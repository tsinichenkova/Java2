package ru.geekbrains.qa.java2.lesson8.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TimesOfDay {
    @JsonProperty(value = "IconPhrase")
    String iconPhrase;

    public TimesOfDay() {
    }

    public String getIconPhrase() {
        return iconPhrase;
    }

    public void setIconPhrase(String iconPhrase) {
        this.iconPhrase = iconPhrase;
    }
}
