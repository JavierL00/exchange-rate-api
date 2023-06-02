package com.softtek.exchangerate.infrastructure.out.jpa.repository;

import com.softtek.exchangerate.infrastructure.out.jpa.entity.ExchangeRateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IExchangeRateRepository extends JpaRepository<ExchangeRateEntity, Long> {
    Optional<ExchangeRateEntity> findByCurrencyFromAndCurrencyTo(String currencyFrom, String currencyTo);
}
