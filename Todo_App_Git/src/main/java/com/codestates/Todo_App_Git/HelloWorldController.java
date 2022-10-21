package com.codestates.Todo_App_Git;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    public String HelloWorld(){
        @GetMapping("/")
        return "To-do Application !";
    }
}
