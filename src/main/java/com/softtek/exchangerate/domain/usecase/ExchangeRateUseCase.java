package com.softtek.exchangerate.domain.usecase;

import com.softtek.exchangerate.domain.api.IExchangeRateServicePort;
import com.softtek.exchangerate.domain.exception.DomainException;
import com.softtek.exchangerate.domain.model.CurrencyConversionModel;
import com.softtek.exchangerate.domain.model.ExchangeRateModel;
import com.softtek.exchangerate.domain.spi.IExchangeRatePersistencePort;
import com.softtek.exchangerate.domain.utils.MessageUtils;

import java.math.BigDecimal;
import java.util.Optional;

public class ExchangeRateUseCase implements IExchangeRateServicePort {
    private final IExchangeRatePersistencePort exchangeRatePersistencePort;

    public ExchangeRateUseCase(IExchangeRatePersistencePort exchangeRatePersistencePort) {
        this.exchangeRatePersistencePort = exchangeRatePersistencePort;
    }

    @Override
    public CurrencyConversionModel convertCurrency(ExchangeRateModel exchangeRateModel, BigDecimal amount) throws DomainException {
        ExchangeRateModel exchangeRateModelFound = getExchangeRate(exchangeRateModel);
        BigDecimal amountWithExchangeRate = amount.multiply(exchangeRateModelFound.getExchangeRate());

        return new CurrencyConversionModel(
                amount,
                amountWithExchangeRate,
                exchangeRateModelFound.getCurrencyFrom(),
                exchangeRateModelFound.getCurrencyTo(),
                exchangeRateModelFound.getExchangeRate()
        );
    }

    @Override
    public void updateExchangeRate(ExchangeRateModel exchangeRateModel) throws DomainException {
        ExchangeRateModel exchangeRateModelFound = getExchangeRate(exchangeRateModel);
        exchangeRateModelFound.setExchangeRate(exchangeRateModel.getExchangeRate());
        exchangeRatePersistencePort.save(exchangeRateModelFound);
    }

    private ExchangeRateModel getExchangeRate(ExchangeRateModel exchangeRateModel) throws DomainException {
        Optional<ExchangeRateModel> exchangeRateModelOptional =
                exchangeRatePersistencePort.findByCurrencyFromAndCurrencyTo(
                        exchangeRateModel.getCurrencyFrom(),
                        exchangeRateModel.getCurrencyTo());

        if (exchangeRateModelOptional.isEmpty()) {
            String errorMessage = String.format(MessageUtils.EXCHANGE_RATE_NOT_FOUND,
                    exchangeRateModel.getCurrencyFrom(), exchangeRateModel.getCurrencyTo());
            throw new DomainException(errorMessage);
        } else {
            return exchangeRateModelOptional.get();
        }
    }
}
