package com.example.greeting.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting() {
        return "Hello, World! Welcome to our Spring Boot application!";
    }
    
    @GetMapping("/")
    public String home() {
        return "Welcome to the Greeting App! Visit /greeting to see the greeting message.";
    }
}