package com.softtek.exchangerate.infrastructure.configuration;

import com.softtek.exchangerate.domain.api.IExchangeRateServicePort;
import com.softtek.exchangerate.domain.spi.IExchangeRatePersistencePort;
import com.softtek.exchangerate.domain.usecase.ExchangeRateUseCase;
import com.softtek.exchangerate.infrastructure.out.jpa.adapter.ExchangeRateJpaAdapter;
import com.softtek.exchangerate.infrastructure.out.jpa.mapper.IExchangeRateEntityMapper;
import com.softtek.exchangerate.infrastructure.out.jpa.repository.IExchangeRateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {
    private final IExchangeRateRepository exchangeRateRepository;
    @Qualifier("IExchangeRateEntityMapper")
    private final IExchangeRateEntityMapper exchangeRateEntityMapper;

    @Bean
    public IExchangeRatePersistencePort exchangeRatePersistencePort() {
        return new ExchangeRateJpaAdapter(exchangeRateRepository, exchangeRateEntityMapper);
    }

    @Bean
    public IExchangeRateServicePort exchangeRateServicePort() {
        return new ExchangeRateUseCase(exchangeRatePersistencePort());
    }
}
