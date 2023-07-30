package com.saiful.blogapplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class WeatherController {

    @RequestMapping(value = "/weather", method = RequestMethod.GET)
    public String WeatherValue() {
        return "Weather : 35 celcius";
    }

}
