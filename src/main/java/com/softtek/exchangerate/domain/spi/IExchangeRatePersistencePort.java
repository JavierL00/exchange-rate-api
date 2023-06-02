package com.softtek.exchangerate.domain.spi;

import com.softtek.exchangerate.domain.model.ExchangeRateModel;

import java.util.Optional;

public interface IExchangeRatePersistencePort {
    void save(ExchangeRateModel exchangeRateModel);
    Optional<ExchangeRateModel> findByCurrencyFromAndCurrencyTo(String currencyFrom, String currencyTo);
}
