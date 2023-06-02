package com.softtek.exchangerate.application.mapper;

import com.softtek.exchangerate.application.dto.request.CurrencyConversionDtoRequest;
import com.softtek.exchangerate.application.dto.request.ExchangeRateDtoRequest;
import com.softtek.exchangerate.application.dto.response.CurrencyConversionDtoResponse;
import com.softtek.exchangerate.domain.model.CurrencyConversionModel;
import com.softtek.exchangerate.domain.model.ExchangeRateModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IExchangeRateMapper {
    ExchangeRateModel toModel(CurrencyConversionDtoRequest currencyConversionDtoRequest);
    ExchangeRateModel toModel(ExchangeRateDtoRequest exchangeRateDtoRequest);
    CurrencyConversionDtoResponse toDto(CurrencyConversionModel currencyConversionModel);
}
