package org.example.restdemo;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingsController {

    public static final String HELLO_S = "Hello %s!";
    private final AtomicLong ids = new AtomicLong();

    public greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        Greeting greeting = new Greeting(ids.getAndIncrement(), String.format(HELLO_S, name));
    }
}
