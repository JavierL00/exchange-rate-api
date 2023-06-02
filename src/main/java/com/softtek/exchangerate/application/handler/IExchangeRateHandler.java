package com.softtek.exchangerate.application.handler;

import com.softtek.exchangerate.application.dto.request.CurrencyConversionDtoRequest;
import com.softtek.exchangerate.application.dto.request.ExchangeRateDtoRequest;
import com.softtek.exchangerate.application.dto.response.CurrencyConversionDtoResponse;

public interface IExchangeRateHandler {
    CurrencyConversionDtoResponse convertCurrency(CurrencyConversionDtoRequest currencyConversionDtoRequest);
    void updateExchangeRate(ExchangeRateDtoRequest exchangeRateDtoRequest);
}
