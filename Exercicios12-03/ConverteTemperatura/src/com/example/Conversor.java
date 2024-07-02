package com.example;

public class Conversor {

    public static double celsiusParaFahrenheit(double temperaturaCelsius) {
        return (temperaturaCelsius * 9/5) + 32;
    }

    public static double fahrenheitParaCelsius(double temperaturaFahrenheit) {
        return (temperaturaFahrenheit - 32) * 5/9;
    }
}
