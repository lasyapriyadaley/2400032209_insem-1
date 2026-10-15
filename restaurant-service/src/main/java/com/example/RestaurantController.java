package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestaurantController {

    @GetMapping("/restaurant")
    public String getRestaurant() {
        return "Restaurant Service is running!";
    }
}