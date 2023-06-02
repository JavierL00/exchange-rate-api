package com.softtek.exchangerate.domain.utils;

public class MessageUtils {
    public static final String EXCHANGE_RATE_NOT_FOUND = "Exchange rate not found for currencies: %s to %s";

    private MessageUtils() {
        throw new IllegalStateException("Utility class");
    }
}
