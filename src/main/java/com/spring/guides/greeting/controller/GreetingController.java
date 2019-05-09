package com.spring.guides.greeting.controller;

import com.spring.guides.greeting.model.Greeting;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController("/greeting")
public class GreetingController {

    private static final String template = "Hello %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/")
    public Greeting greeting(@RequestParam(name = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
     }

     @PostMapping("/add")
    public void addGreeting(@RequestBody Greeting greeting) {

     }
}
