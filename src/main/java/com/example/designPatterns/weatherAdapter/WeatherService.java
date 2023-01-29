package com.example.designPatterns.weatherAdapter;

public interface WeatherService {
        WeatherData getWeather(String location);
        WeatherData getWeather(double latitude, double longitude);
}
