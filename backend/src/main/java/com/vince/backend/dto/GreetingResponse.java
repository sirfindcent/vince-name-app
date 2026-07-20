package com.vince.backend.dto;

public class GreetingResponse {

    private final String greeting;

    public GreetingResponse(String greeting){
        this.greeting = greeting;
    }

    // Jackson needs this getter to extract the value and create the JSON!
    public String getGreeting(){
        return greeting;
    }


}
