package com.softtek.exchangerate.infrastructure.input.rest;

import com.softtek.exchangerate.application.dto.request.CurrencyConversionDtoRequest;
import com.softtek.exchangerate.application.dto.request.ExchangeRateDtoRequest;
import com.softtek.exchangerate.application.dto.response.CurrencyConversionDtoResponse;
import com.softtek.exchangerate.application.exception.ApplicationException;
import com.softtek.exchangerate.application.handler.IExchangeRateHandler;
import com.softtek.exchangerate.infrastructure.exception.InfrastructureException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/exchange-rate")
public class ExchangeRateController {
    private final IExchangeRateHandler exchangeRateHandler;

    @PostMapping("/currency-conversion")
    public ResponseEntity<CurrencyConversionDtoResponse> convertCurrency(
            @RequestBody CurrencyConversionDtoRequest currencyConversionDtoRequest
    ) {
        try {
            CurrencyConversionDtoResponse currencyConversionDtoResponse =
                    exchangeRateHandler.convertCurrency(currencyConversionDtoRequest);
            return ResponseEntity.ok(currencyConversionDtoResponse);
        }
        catch (ApplicationException e) {
            throw new InfrastructureException(e.getMessage());
        }
    }

    @PutMapping("/update-exchange-rate")
    public ResponseEntity<Void> updateExchangeRate(
            @RequestBody ExchangeRateDtoRequest exchangeRateDtoRequest
    ) {
        try {
            exchangeRateHandler.updateExchangeRate(exchangeRateDtoRequest);
            return ResponseEntity.ok().build();
        }
        catch (ApplicationException e) {
            throw new InfrastructureException(e.getMessage());
        }
    }
}
