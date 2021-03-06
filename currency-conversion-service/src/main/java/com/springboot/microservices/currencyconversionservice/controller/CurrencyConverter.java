package com.springboot.microservices.currencyconversionservice.controller;

import com.springboot.microservices.currencyconversionservice.Bean.CurrencyConverterBean;
import com.springboot.microservices.currencyconversionservice.proxy.CurrencyConverterProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Environment.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.HashMap;

@RestController
public class CurrencyConverter {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    CurrencyConverterProxy proxy;


    @GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConverterBean convertCurrency(@PathVariable String from, @PathVariable String to,
                                                  @PathVariable BigDecimal quantity) {

        //LOGGER.info("Received Request to convert from {} {} to {}. ", quantity, from, to);

        CurrencyConverterBean response = proxy.retriveExchnageValue(from, to);

        BigDecimal convertedValue = quantity.multiply(response.getConvertedValue());

        return new CurrencyConverterBean(response.getId(), from, to, response.getConversionController(), quantity,
                convertedValue);
    }

    @GetMapping("/currency-converter-feign/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConverterBean convertCurrencyFeign(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity){

        CurrencyConverterBean response = proxy.retriveExchnageValue(from, to);
        logger.info("{}", response);
        return new CurrencyConverterBean(response.getId(), from, to, response.getConversionController(), quantity, quantity.multiply(response.getConversionController()));
    }

}
