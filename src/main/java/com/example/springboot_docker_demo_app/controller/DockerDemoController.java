package com.example.springboot_docker_demo_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerDemoController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello from Dockerized Spring Boot!";
    }
}
