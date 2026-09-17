package com.Calebe.log_analizer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController{
    
    @GetMapping("/localhost")
    public String localhost() {
        return "YOU'RE IN YOUR APICONTROLLER";
    }
}