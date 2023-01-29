package com.example.designPatterns.weatherAdapter;

public class ExternalWeatherAPI {

    public WeatherData getWeatherData(String location) {
        // calls external api method to give weather data based on location
        return new WeatherData(location, 25, 1.2, 43.342);
    }
}
