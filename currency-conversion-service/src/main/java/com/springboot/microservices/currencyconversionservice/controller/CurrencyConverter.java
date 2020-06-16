package com.springboot.microservices.currencyconversionservice.controller;

import com.springboot.microservices.currencyconversionservice.Bean.CurrencyConverterBean;
import com.springboot.microservices.currencyconversionservice.proxy.CurrencyConverterProxy;
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

    @Autowired
    CurrencyConverterProxy proxy;

//    @GetMapping("/currency-convertr/from/{from}/to/{to}/quantity/{quantity}")
//    public CurrencyConverterBean convertCurrency(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity){
//
//        System.out.println(quantity);
//
//        HashMap<String, String> uriVariables = new HashMap<>();
//        uriVariables.put("from", from);
//        uriVariables.put("to", to);
//
//        ResponseEntity<CurrencyConverterBean> responseEntity = new RestTemplate().getForEntity("http://localhost:8000/currency-exchnage/from/{from}/to/{to}", CurrencyConverterBean.class, uriVariables);
//
//        CurrencyConverterBean response = responseEntity.getBody();
//
//        return new CurrencyConverterBean(response.getId(), from, to, response.getConversionController(), quantity, quantity.multiply(response.getConversionController()));
//    }

    @GetMapping("/currency-convertr-feign/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConverterBean convertCurrencyFeign(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity){

        CurrencyConverterBean response = proxy.retriveExchnageValue(from, to);

        return new CurrencyConverterBean(response.getId(), from, to, response.getConversionController(), quantity, quantity.multiply(response.getConversionController()));
    }

}
