package com.example2.demo2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class MyController {

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "Hello, " + name + "!";
    }
    @GetMapping("/fetch")
    public String fetch() {
        return "data fetching";
    }

    @PostMapping("/post")
    public String postData(@RequestBody String data) {
        // Process the received data here
        return "Received data: " + data;
    }
    
}
