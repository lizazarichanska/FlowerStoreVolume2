package com.example.lab7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Lab7Application {
    @Autowired
    public String data;

    public static void main(String[] args) {
        SpringApplication.run(Lab7Application.class, args);
    }

    @GetMapping
    public String hello() {
        return data;
    }
}
