package com.softtek.exchangerate.infrastructure.out.jpa.adapter;

import com.softtek.exchangerate.domain.model.ExchangeRateModel;
import com.softtek.exchangerate.domain.spi.IExchangeRatePersistencePort;
import com.softtek.exchangerate.infrastructure.out.jpa.entity.ExchangeRateEntity;
import com.softtek.exchangerate.infrastructure.out.jpa.mapper.IExchangeRateEntityMapper;
import com.softtek.exchangerate.infrastructure.out.jpa.repository.IExchangeRateRepository;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class ExchangeRateJpaAdapter implements IExchangeRatePersistencePort {
    private final IExchangeRateRepository exchangeRateRepository;
    private final IExchangeRateEntityMapper exchangeRateEntityMapper;

    @Override
    public void save(ExchangeRateModel exchangeRateModel) {
        ExchangeRateEntity exchangeRateEntity = exchangeRateEntityMapper.toEntity(exchangeRateModel);
        exchangeRateRepository.save(exchangeRateEntity);
    }

    @Override
    public Optional<ExchangeRateModel> findByCurrencyFromAndCurrencyTo(String currencyFrom, String currencyTo) {
        Optional<ExchangeRateEntity> exchangeRateEntity = exchangeRateRepository.findByCurrencyFromAndCurrencyTo(currencyFrom, currencyTo);
        return exchangeRateEntity.map(exchangeRateEntityMapper::toModel);
    }
}
