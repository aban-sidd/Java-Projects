# Java-Projects

## 🔹 Overview
This repository contains Java Spring Boot projects that demonstrate RESTful API development and real-time data integration using external APIs. It showcases clean architecture, service-oriented design, and hands-on use of Java-based backend technologies for live weather data applications.


🚀 Technologies & Tools
Java 17, Spring Boot, Spring Web, RestTemplate, OpenWeatherMap API, Gradle, Postman, IntelliJ IDEA

### 📂 Weather API Project
#### 1️⃣ Java Spring Boot – Real-time Weather App
#### 📌 Folder: /src/main/java/com/example/weatherapp
#### 🔹 Objective: Build a RESTful API to fetch live weather data based on city name using OpenWeatherMap.
#### 🔹 Features & Techniques Used:

- REST API with GET /api/weather/{city} and GET / root endpoint
- Integration with OpenWeatherMap using RestTemplate
- Custom property management via application.properties
- Clean separation of concerns (Controller → Service → Model)
- Deserialization of JSON response into custom POJO
- Friendly fallback and response structure for root endpoint
- Java best practices with proper naming and structure

