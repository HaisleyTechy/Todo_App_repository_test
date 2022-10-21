package com.codestates.Todo_App_Git;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/")
    public String helloWorld(){

        return "To-do Application !";
    }
}
