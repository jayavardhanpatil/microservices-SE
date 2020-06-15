package com.springboot.microservices.currencyexchangeservice.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity()
public class ExchangeValue {

    @Id
    private long id;

    @Column(name = "currency_from")
    private String from;

    @Column(name = "currency_to")
    private String to;

    @Column(name = "conversion_multiple")
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
