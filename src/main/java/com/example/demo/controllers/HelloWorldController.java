package com.example.demo.controllers;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public String hello() {
        return """
            <html>
                <head>
                    <title>Hello World</title>
                </head>
                <body>
                    <h1 style="color: red">Hello World</h1>
                </body>
            </html>
        """;
    }
}
