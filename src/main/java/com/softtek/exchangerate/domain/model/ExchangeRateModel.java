package com.softtek.exchangerate.domain.model;

import java.math.BigDecimal;

public class ExchangeRateModel {
    private Long id;
    private String currencyFrom;
    private String currencyTo;
    private BigDecimal exchangeRate;

    public ExchangeRateModel(Long id, String currencyFrom, String currencyTo, BigDecimal exchangeRate) {
        this.id = id;
        this.currencyFrom = currencyFrom;
        this.currencyTo = currencyTo;
        this.exchangeRate = exchangeRate;
    }

    public ExchangeRateModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCurrencyFrom() {
        return currencyFrom;
    }

    public void setCurrencyFrom(String currencyFrom) {
        this.currencyFrom = currencyFrom;
    }

    public String getCurrencyTo() {
        return currencyTo;
    }

    public void setCurrencyTo(String currencyTo) {
        this.currencyTo = currencyTo;
    }

    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
}
