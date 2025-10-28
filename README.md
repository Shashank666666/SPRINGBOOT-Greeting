# Spring Boot Greeting Application

This is a simple Spring Boot application that demonstrates basic REST API functionality with a greeting endpoint.

## Features

- Simple REST controller with two endpoints:
  - `/` : Home endpoint showing welcome message
  - `/greeting` : Returns a greeting message
- Built with Spring Boot 3.3.4
- Uses Java 17
- Maven for dependency management

## Prerequisites

- Java 17 JDK installed
- Maven 3.6+ (or use included Maven wrapper)

## Running the Application

1. Clone the repository
2. Navigate to the project directory
3. Run the application using one of these methods:
   - Using Maven: `mvn spring-boot:run`
   - Using Java: `mvn clean package` then `java -jar target/greeting-app-0.0.1-SNAPSHOT.jar`

The application will start on port 8080. Visit http://localhost:8080 to access the application.

## Endpoints

- `GET /` : Welcome page
- `GET /greeting` : Greeting message

## Building the Project

To build the project, run:

```bash
mvn clean package
```

This will create an executable JAR file in the `target` directory.