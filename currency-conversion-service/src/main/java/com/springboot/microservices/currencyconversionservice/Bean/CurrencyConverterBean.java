package com.springboot.microservices.currencyconversionservice.Bean;

import java.math.BigDecimal;

public class CurrencyConverterBean {

    private int id;
    private String from;
    private String to;
    private BigDecimal conversionController;
    private BigDecimal quantity;
    private BigDecimal convertedValue;

    public CurrencyConverterBean() {
    }

    public CurrencyConverterBean(int id, String from, String to, BigDecimal conversionController, BigDecimal quantity, BigDecimal convertedValue) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionController = conversionController;
        this.quantity = quantity;
        this.convertedValue = convertedValue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getConvertedValue() {
        return convertedValue;
    }

    public void setConvertedValue(BigDecimal convertedValue) {
        this.convertedValue = convertedValue;
    }
}
