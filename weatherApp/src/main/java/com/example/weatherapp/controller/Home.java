package com.example.weatherapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Home {

    @GetMapping("/")
    public String home(){
        return "Welcome to the Weather API! Try /api/weather/Lahore";
    }

}
