package com.example.springsecurity.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {
        
    @GetMapping("/")
    public String home() {
        return "Hello";
    }
}
