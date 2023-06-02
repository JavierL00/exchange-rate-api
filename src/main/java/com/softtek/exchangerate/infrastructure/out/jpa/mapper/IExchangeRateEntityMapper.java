package com.softtek.exchangerate.infrastructure.out.jpa.mapper;

import com.softtek.exchangerate.domain.model.ExchangeRateModel;
import com.softtek.exchangerate.infrastructure.out.jpa.entity.ExchangeRateEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IExchangeRateEntityMapper {
    ExchangeRateEntity toEntity(ExchangeRateModel exchangeRateModel);
    ExchangeRateModel toModel(ExchangeRateEntity exchangeRateEntity);
}
