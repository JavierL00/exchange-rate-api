package com.softtek.exchangerate.domain.model;

import java.math.BigDecimal;

public class CurrencyConversionModel {
    private BigDecimal amount;
    private BigDecimal amountWithExchangeRate;
    private String currencyFrom;
    private String currencyTo;
    private BigDecimal exchangeRate;

    public CurrencyConversionModel(BigDecimal amount, BigDecimal amountWithExchangeRate, String currencyFrom, String currencyTo, BigDecimal exchangeRate) {
        this.amount = amount;
        this.amountWithExchangeRate = amountWithExchangeRate;
        this.currencyFrom = currencyFrom;
        this.currencyTo = currencyTo;
        this.exchangeRate = exchangeRate;
    }

    public CurrencyConversionModel() {
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmountWithExchangeRate() {
        return amountWithExchangeRate;
    }

    public void setAmountWithExchangeRate(BigDecimal amountWithExchangeRate) {
        this.amountWithExchangeRate = amountWithExchangeRate;
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
