package com.youtube.security;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(path = "/status")
    public  String getStatus(){
        return "Application is running!";
    }
}
