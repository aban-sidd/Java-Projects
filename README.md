# Java-Projects

## 🔹 Overview
This repository contains Java Spring Boot projects that demonstrate RESTful API development and real-time data integration using external APIs. It showcases clean architecture, service-oriented design, and hands-on use of Java-based backend technologies for live weather data applications.


🚀 Technologies & Tools
Java 17, Spring Boot, Spring Web, RestTemplate, API, Gradle, Postman, IntelliJ IDEA

### 📂 Weather API Project
#### 1 Java Spring Boot – Real-time Weather App
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

### 📂 To-Do App Project
#### 2 Java Spring Boot – Task Management REST API
#### 📌 Folder: /src/main/java/com/example/todoapp
#### 🔹 Objective: Build a CRUD-based RESTful API to manage to-do tasks using Spring Boot and MySQL.
#### 🔹 Features & Techniques Used:
#### REST API with:
<ul style="margin-left: 30px;">
  <li>GET /api/todo – Retrieve all tasks</li>
  <li>GET /api/todo/{id} – Retrieve a single task by ID</li>
  <li>POST /api/todo – Create a new task</li>
  <li>PUT /api/todo/{id} – Update an existing task</li>
  <li>DELETE /api/todo/{id} – Delete a task</li>
</ul>

- Spring Boot with Spring Web for backend API development
- Spring Data JPA to connect and interact with MySQL database
- application.properties for external configuration (DB credentials, JPA settings)
- Entity-Relationship mapping using @Entity, @Id, and @GeneratedValue
- Layered structure: Controller → Service → Repository → Entity
- Automatic table creation using spring.jpa.hibernate.ddl-auto=update
- Clean, maintainable code using Java naming and structural best practices
