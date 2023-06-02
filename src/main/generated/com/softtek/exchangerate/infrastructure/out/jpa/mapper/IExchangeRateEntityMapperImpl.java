package com.softtek.exchangerate.infrastructure.out.jpa.mapper;

import com.softtek.exchangerate.domain.model.ExchangeRateModel;
import com.softtek.exchangerate.infrastructure.out.jpa.entity.ExchangeRateEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-02T09:24:53-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.7 (Amazon.com Inc.)"
)
@Component
public class IExchangeRateEntityMapperImpl implements IExchangeRateEntityMapper {

    @Override
    public ExchangeRateEntity toEntity(ExchangeRateModel exchangeRateModel) {
        if ( exchangeRateModel == null ) {
            return null;
        }

        ExchangeRateEntity exchangeRateEntity = new ExchangeRateEntity();

        exchangeRateEntity.setId( exchangeRateModel.getId() );
        exchangeRateEntity.setCurrencyFrom( exchangeRateModel.getCurrencyFrom() );
        exchangeRateEntity.setCurrencyTo( exchangeRateModel.getCurrencyTo() );
        exchangeRateEntity.setExchangeRate( exchangeRateModel.getExchangeRate() );

        return exchangeRateEntity;
    }

    @Override
    public ExchangeRateModel toModel(ExchangeRateEntity exchangeRateEntity) {
        if ( exchangeRateEntity == null ) {
            return null;
        }

        ExchangeRateModel exchangeRateModel = new ExchangeRateModel();

        exchangeRateModel.setId( exchangeRateEntity.getId() );
        exchangeRateModel.setCurrencyFrom( exchangeRateEntity.getCurrencyFrom() );
        exchangeRateModel.setCurrencyTo( exchangeRateEntity.getCurrencyTo() );
        exchangeRateModel.setExchangeRate( exchangeRateEntity.getExchangeRate() );

        return exchangeRateModel;
    }
}
