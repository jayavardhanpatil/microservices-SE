package com.springboot.microservices.currencyexchangeservice.controller;


import com.springboot.microservices.currencyexchangeservice.bean.ExchangeValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController {

    @GetMapping("/currency-exchnage/from/{from}/to/{to}")
    public ExchangeValue retriveExchnageValue(@PathVariable String from, @PathVariable String to){

        return new ExchangeValue(1001L, from, to, BigDecimal.valueOf(65));
    }
}
