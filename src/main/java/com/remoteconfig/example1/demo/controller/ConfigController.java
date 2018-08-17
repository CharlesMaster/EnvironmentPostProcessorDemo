package com.remoteconfig.example1.demo.controller;


import com.remoteconfig.example1.demo.property.ConfigProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Autowired
    ConfigProperty configProperty;

    @RequestMapping("/author")
    Object getConfigAuthor() {

        return configProperty.getAuthor();
    }

    @RequestMapping("/city")
    Object getConfigCity() {

        return configProperty.getCity();
    }
}
