package com.bhagya.controller;

import com.bhagya.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {
    @Autowired
    GreetingService greetingService;

    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String greet(){
        return greetingService.greet();
    }
}
