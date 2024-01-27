package com.example.Restexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestEx {
    @GetMapping("/getResp")
    public String getRestResponse(){
        return "Response from spring rest Service";
    }
}
