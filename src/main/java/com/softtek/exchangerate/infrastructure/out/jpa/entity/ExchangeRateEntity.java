package com.softtek.exchangerate.infrastructure.out.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "exchange_rate")
public class ExchangeRateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "currency_from")
    private String currencyFrom;

    @Column(name = "currency_to")
    private String currencyTo;

    @Column(name = "exchange_rate", precision = 38, scale = 4)
    private BigDecimal exchangeRate;
}
