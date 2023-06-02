package com.softtek.exchangerate.application.handler.impl;

import com.softtek.exchangerate.application.dto.request.CurrencyConversionDtoRequest;
import com.softtek.exchangerate.application.dto.request.ExchangeRateDtoRequest;
import com.softtek.exchangerate.application.dto.response.CurrencyConversionDtoResponse;
import com.softtek.exchangerate.application.exception.ApplicationException;
import com.softtek.exchangerate.application.handler.IExchangeRateHandler;
import com.softtek.exchangerate.application.mapper.IExchangeRateMapper;
import com.softtek.exchangerate.domain.api.IExchangeRateServicePort;
import com.softtek.exchangerate.domain.exception.DomainException;
import com.softtek.exchangerate.domain.model.CurrencyConversionModel;
import com.softtek.exchangerate.domain.model.ExchangeRateModel;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class ExchangeRateHandlerImpl implements IExchangeRateHandler {
    private final IExchangeRateServicePort exchangeRateServicePort;
    @Qualifier("IExchangeRateMapper")
    private final IExchangeRateMapper exchangeRateMapper;

    @Override
    public CurrencyConversionDtoResponse convertCurrency(CurrencyConversionDtoRequest currencyConversionDtoRequest) throws ApplicationException {
        try {
            ExchangeRateModel exchangeRateModel = exchangeRateMapper.toModel(currencyConversionDtoRequest);
            CurrencyConversionModel currencyConversionModel =
                    exchangeRateServicePort.convertCurrency(exchangeRateModel,
                            currencyConversionDtoRequest.getAmount());
            return exchangeRateMapper.toDto(currencyConversionModel);
        }
        catch (DomainException e) {
            String errorMessage = e.getMessage();
            throw new ApplicationException(errorMessage);
        }
    }

    @Override
    public void updateExchangeRate(ExchangeRateDtoRequest exchangeRateDtoRequest) throws ApplicationException {
        try {
            ExchangeRateModel exchangeRateModel = exchangeRateMapper.toModel(exchangeRateDtoRequest);
            exchangeRateServicePort.updateExchangeRate(exchangeRateModel);
        }
        catch (DomainException e) {
            String errorMessage = e.getMessage();
            throw new ApplicationException(errorMessage);
        }
    }
}
