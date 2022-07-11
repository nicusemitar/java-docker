package com.example.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello/docker")
public class HelloDocker {

    @GetMapping
    public String displayHello() {
        return "Hello Docker";
    }
}
