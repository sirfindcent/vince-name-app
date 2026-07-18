package com.vince.backend.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class GreetingController {

    @GetMapping("api/hello")
    public String hello(){
        return "Hello Vincent";
    }

}
