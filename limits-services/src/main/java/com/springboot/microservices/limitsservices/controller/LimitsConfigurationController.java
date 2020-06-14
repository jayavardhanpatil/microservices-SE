package com.springboot.microservices.limitsservices.controller;

import com.springboot.microservices.limitsservices.Configuration;
import com.springboot.microservices.limitsservices.bean.LimitsConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public LimitsConfiguration retreiveLimitsFromConfiguration(){
        return new LimitsConfiguration(configuration.getMin(),configuration.getMax());
    }

}
