package ru.geekbrains.qa.java2.lesson7.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Temperature {

    @JsonProperty(value = "Metric")
    Metrics metric;

    @JsonProperty(value = "Imperial")
    Metrics imperial;

    public Temperature() {
    }

    public Metrics getMetric() {
        return metric;
    }

    public void setMetric(Metrics metric) {
        this.metric = metric;
    }

    public Metrics getImperial() {
        return imperial;
    }

    public void setImperial(Metrics imperial) {
        this.imperial = imperial;
    }
}
