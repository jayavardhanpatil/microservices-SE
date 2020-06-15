package com.springboot.microservices.currencyexchangeservice.controller;


import com.springboot.microservices.currencyexchangeservice.bean.ExchangeValue;
import com.springboot.microservices.currencyexchangeservice.repository.ExchangeValueRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController {

    @Autowired
    ExchangeValueRepo exchangeValueRepo;

    @GetMapping("/currency-exchnage/from/{from}/to/{to}")
    public ExchangeValue retriveExchnageValue(@PathVariable String from, @PathVariable String to){

        return exchangeValueRepo.findByFromAndTo(from, to);
    }
}
