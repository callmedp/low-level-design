package com.example.designPatterns.weatherAdapter;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherAdapter {

    private ExternalWeatherAPI weatherApi;

    public WeatherAdapter(ExternalWeatherAPI weatherApi) {
        this.weatherApi = weatherApi;
    }


    private String getLocationFromLatLong(double latitude, double longitude) {
        return "New York";
    }

    public WeatherData getWeatherData(String location) {
        return weatherApi.getWeatherData(location);
    }

    public WeatherData getWeatherData(double latitude, double longitude) {
        //code that converts latitude and longitude to location and calls the external weather api
        String location = getLocationFromLatLong(latitude, longitude);
        return weatherApi.getWeatherData(location);
    }
}
