package ru.geekbrains.qa.java2.lesson8.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Temperature {

    @JsonProperty(value = "Metric")
    TemperatureUnit metric;

    @JsonProperty(value = "Imperial")
    TemperatureUnit imperial;

    @JsonProperty(value = "Minimum")
    TemperatureUnit minimum;

    @JsonProperty(value = "Maximum")
    TemperatureUnit maximum;

    public Temperature() {
    }

    public TemperatureUnit getMetric() {
        return metric;
    }

    public void setMetric(TemperatureUnit metric) {
        this.metric = metric;
    }

    public TemperatureUnit getImperial() {
        return imperial;
    }

    public void setImperial(TemperatureUnit imperial) {
        this.imperial = imperial;
    }

    public TemperatureUnit getMinimum() {
        return minimum;
    }

    public void setMinimum(TemperatureUnit minimum) {
        this.minimum = minimum;
    }

    public TemperatureUnit getMaximum() {
        return maximum;
    }

    public void setMaximum(TemperatureUnit maximum) {
        this.maximum = maximum;
    }
}
