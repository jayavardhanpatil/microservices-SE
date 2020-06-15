package com.springboot.microservices.currencyconversionservice.proxy;

import com.springboot.microservices.currencyconversionservice.Bean.CurrencyConverterBean;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "currency-exchange-service", url = "localhost:8000")
@RibbonClient(name = "currency-exchange-service")
public interface CurrencyConverterProxy {

    @GetMapping("/currency-exchnage/from/{from}/to/{to}")
    public CurrencyConverterBean retriveExchnageValue(@PathVariable("from" )String from, @PathVariable("to") String to);

}