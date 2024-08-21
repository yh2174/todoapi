package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Maincontroller {
    @GetMapping("/")
    public String welcome() {
        return "Hello World!";
    }

    @GetMapping("/health/checker")
    public String healthChecker() {
        return "success";
    }
}
