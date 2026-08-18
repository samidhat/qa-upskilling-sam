package com.qa;

public class temperatureConverter {
    double tp;

    public temperatureConverter(double tp) {
        this.tp = tp;
    }

    // Farenheit to Celsius
    public double celsiusConverter() {
        return (tp - 32) * 5 / 9;
    }

    // Celsius to Farenheit
    public double FarenheitConverter() {
        return (tp * 9 / 5) + 32;
    }
}
