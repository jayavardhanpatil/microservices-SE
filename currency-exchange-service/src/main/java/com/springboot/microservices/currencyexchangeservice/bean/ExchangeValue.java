package com.springboot.microservices.currencyexchangeservice.bean;

import java.math.BigDecimal;

public class ExchangeValue {

    private long id;
    private String from;
    private String to;
    private BigDecimal conversionController;

    public ExchangeValue() {
    }

    public ExchangeValue(long id, String from, String to, BigDecimal conversionController) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionController = conversionController;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getConversionController() {
        return conversionController;
    }

    public void setConversionController(BigDecimal conversionController) {
        this.conversionController = conversionController;
    }
}
