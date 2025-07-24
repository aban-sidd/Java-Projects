package com.example.weatherapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class weatherResponse {
    private String city;
    private String description;
    private double temperature;

    public  weatherResponse(){}
}
