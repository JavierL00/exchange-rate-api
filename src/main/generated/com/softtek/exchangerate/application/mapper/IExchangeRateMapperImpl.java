package com.softtek.exchangerate.application.mapper;

import com.softtek.exchangerate.application.dto.request.CurrencyConversionDtoRequest;
import com.softtek.exchangerate.application.dto.request.ExchangeRateDtoRequest;
import com.softtek.exchangerate.application.dto.response.CurrencyConversionDtoResponse;
import com.softtek.exchangerate.domain.model.CurrencyConversionModel;
import com.softtek.exchangerate.domain.model.ExchangeRateModel;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-02T09:24:53-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.7 (Amazon.com Inc.)"
)
@Component
public class IExchangeRateMapperImpl implements IExchangeRateMapper {

    @Override
    public ExchangeRateModel toModel(CurrencyConversionDtoRequest currencyConversionDtoRequest) {
        if ( currencyConversionDtoRequest == null ) {
            return null;
        }

        ExchangeRateModel exchangeRateModel = new ExchangeRateModel();

        exchangeRateModel.setCurrencyFrom( currencyConversionDtoRequest.getCurrencyFrom() );
        exchangeRateModel.setCurrencyTo( currencyConversionDtoRequest.getCurrencyTo() );

        return exchangeRateModel;
    }

    @Override
    public ExchangeRateModel toModel(ExchangeRateDtoRequest exchangeRateDtoRequest) {
        if ( exchangeRateDtoRequest == null ) {
            return null;
        }

        ExchangeRateModel exchangeRateModel = new ExchangeRateModel();

        exchangeRateModel.setCurrencyFrom( exchangeRateDtoRequest.getCurrencyFrom() );
        exchangeRateModel.setCurrencyTo( exchangeRateDtoRequest.getCurrencyTo() );
        exchangeRateModel.setExchangeRate( exchangeRateDtoRequest.getExchangeRate() );

        return exchangeRateModel;
    }

    @Override
    public CurrencyConversionDtoResponse toDto(CurrencyConversionModel currencyConversionModel) {
        if ( currencyConversionModel == null ) {
            return null;
        }

        CurrencyConversionDtoResponse currencyConversionDtoResponse = new CurrencyConversionDtoResponse();

        currencyConversionDtoResponse.setAmount( currencyConversionModel.getAmount() );
        currencyConversionDtoResponse.setAmountWithExchangeRate( currencyConversionModel.getAmountWithExchangeRate() );
        currencyConversionDtoResponse.setCurrencyFrom( currencyConversionModel.getCurrencyFrom() );
        currencyConversionDtoResponse.setCurrencyTo( currencyConversionModel.getCurrencyTo() );
        currencyConversionDtoResponse.setExchangeRate( currencyConversionModel.getExchangeRate() );

        return currencyConversionDtoResponse;
    }
}
