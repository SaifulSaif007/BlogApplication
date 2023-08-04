package com.saiful.blogapplication.controller;

import com.saiful.blogapplication.model.Test;
import com.saiful.blogapplication.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class WeatherController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/weather", method = RequestMethod.GET)
    public String WeatherValue() {
        return "Weather : 35 celcius";
    }

    @RequestMapping(value = "/firebase", method = RequestMethod.GET)
    public Test GetTest() {
        return testService.getTest();
    }

}
