package com.brendytravelbuddy.travelbuddy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello/{name}")
    public String say_hello(@PathVariable String name) {
        return "Hello " + name + "!";
    }
}