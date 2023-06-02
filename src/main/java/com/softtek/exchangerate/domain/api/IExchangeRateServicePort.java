package com.softtek.exchangerate.domain.api;

import com.softtek.exchangerate.domain.model.CurrencyConversionModel;
import com.softtek.exchangerate.domain.model.ExchangeRateModel;

import java.math.BigDecimal;

public interface IExchangeRateServicePort {
    CurrencyConversionModel convertCurrency(ExchangeRateModel exchangeRateModel, BigDecimal amount);
    void updateExchangeRate(ExchangeRateModel exchangeRateModel);
}
