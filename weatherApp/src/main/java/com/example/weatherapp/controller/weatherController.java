package com.example.weatherapp.controller;

import com.example.weatherapp.model.weatherResponse;
import com.example.weatherapp.service.weatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/weather")
public class weatherController {

    @Autowired
    private weatherService weatherService;

    @GetMapping("/{city}")
    public weatherResponse getWeather(@PathVariable String city){
        return weatherService.getWeather(city);
    }
}
