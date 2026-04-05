package com.example.cicddemo.controller; // use your actual package

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String home() {
        return "Welcome to Vedant's CI/CD App 🚀";
    }

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of(
                "status", "UP",
                "service", "cicd-app",
                "timestamp", java.time.LocalDateTime.now().toString()
        );
    }

    @GetMapping("/api/v1/info")
    public Map<String, String> info() {
        return Map.of(
                "version", "1.0",
                "author", "Vedant",
                "feature", "CI/CD Pipeline"
        );
    }
    @GetMapping("/api/v1/time")
    public Map<String, String> time() {
        return Map.of(
                "serverTime", java.time.LocalDateTime.now().toString()
        );
    }
}