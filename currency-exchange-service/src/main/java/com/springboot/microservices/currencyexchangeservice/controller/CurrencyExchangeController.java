package com.springboot.microservices.currencyexchangeservice.controller;


import com.springboot.microservices.currencyexchangeservice.bean.ExchangeValue;
import com.springboot.microservices.currencyexchangeservice.repository.ExchangeValueRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {

    @Autowired
    ExchangeValueRepo exchangeValueRepo;

    @Autowired
    Environment environment;

    @GetMapping("/currency-exchnage/from/{from}/to/{to}")
    public ExchangeValue retrieveExchangeValue
            (@PathVariable String from, @PathVariable String to){

        ExchangeValue exchangeValue = exchangeValueRepo.findByFromAndTo(from, to);
        System.out.println(environment.getProperty("local.server.port"));
        return exchangeValue;
    }
}
