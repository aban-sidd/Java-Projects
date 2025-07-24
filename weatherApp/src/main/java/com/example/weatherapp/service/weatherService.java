package com.example.weatherapp.service;

import com.example.weatherapp.model.weatherResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.LinkedHashMap;

@Service
public class weatherService {
    @Value("${weather.api.key}")
    private String apiKey;

    @Value("${weather.api.url}")
    private String apiUrl;

    public weatherResponse getWeather (String city){
        String url = apiUrl + "?q=" + city + "&appid=" + apiKey + "&units=metric";

        RestTemplate restTemplate = new RestTemplate();

        LinkedHashMap<String, Object> response = restTemplate.getForObject(url , LinkedHashMap.class);

        if (response == null || response.isEmpty()) return null;

        String cityName = (String) response.get("name");

        LinkedHashMap<String, Object> main = (LinkedHashMap<String, Object>) response.get("main");
        double temp = (double) main.get("temp");

        LinkedHashMap<String, Object> weather = (LinkedHashMap<String, Object>) ((java.util.List<?>) response.get("weather")).get(0);
        String description = (String) weather.get("description");

        return new weatherResponse(cityName , description, temp);
    }
}
