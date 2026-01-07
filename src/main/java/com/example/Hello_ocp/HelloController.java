package com.example.Hello_ocp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Hello from Spring Boot on OpenShift!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
