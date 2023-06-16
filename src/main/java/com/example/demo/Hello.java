package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("/")
    public String hello(
            @RequestParam(value = "name", defaultValue = "World") String name,
            @RequestParam(value = "hi", defaultValue = "Hello") String hi
    ) {
        return hi +" "+ name;




    }
}
