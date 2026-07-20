package com.vince.backend.controller;
import com.vince.backend.dto.GreetingResponse;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class GreetingController {

    @GetMapping("api/hello")
    public GreetingResponse hello(@RequestParam(defaultValue = "Vincent") String name){
        return new GreetingResponse("Hello, " + name);
    }

}
