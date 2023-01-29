package com.example.designPatterns;

import com.example.designPatterns.weatherAdapter.ExternalWeatherAPI;
import com.example.designPatterns.weatherAdapter.WeatherAdapter;
import com.example.designPatterns.weatherAdapter.WeatherData;
import org.json.JSONException;

import java.io.IOException;

public class Adapter {

    public void clientAdapter() {
        //this is the client part of using adapter pattern

        ExternalWeatherAPI externalWeatherAPI = new ExternalWeatherAPI();
        WeatherAdapter weatherAdapter = new WeatherAdapter(externalWeatherAPI);

        double latitude = 40.730610;
        double longitude = -73.935242;
        WeatherData weatherReport = weatherAdapter.getWeatherData(latitude, longitude);


        System.out.println(weatherReport);
    }

}
