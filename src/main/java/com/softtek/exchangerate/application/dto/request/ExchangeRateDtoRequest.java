package com.softtek.exchangerate.application.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ExchangeRateDtoRequest {
    private String currencyFrom;
    private String currencyTo;
    private BigDecimal exchangeRate;
}
