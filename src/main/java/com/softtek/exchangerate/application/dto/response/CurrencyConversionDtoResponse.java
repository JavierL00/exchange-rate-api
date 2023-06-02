package com.softtek.exchangerate.application.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CurrencyConversionDtoResponse {
    private BigDecimal amount;
    private BigDecimal amountWithExchangeRate;
    private String currencyFrom;
    private String currencyTo;
    private BigDecimal exchangeRate;
}
