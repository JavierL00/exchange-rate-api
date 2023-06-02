# exchange-rate-api
The Exchange Rate API provides services to convert currencies and update exchange rates. It allows users to get the current exchange rate between two currencies and perform currency conversions based on that rate.

API resources:

1. Currency Conversion:
POST /api/exchange-rate/currency-conversion: This endpoint allows you to convert an amount from one currency to another. The source currency, the destination currency, and the amount to be converted must be provided in the request body. Returns the result of the conversion along with the information of the currencies involved.

Body:
{
  "amount": 100,
  "currencyFrom": "CAD",
  "currencyTo": "USD"
}

2. Exchange Rate Update:
PUT /api/exchange-rate/update-exchange-rate: This endpoint allows updating the exchange rate between two currencies. The source currency, destination currency, and new exchange rate must be provided in the request body. The API is responsible for storing and updating the exchange rate in the system.

Body:
{
    "currencyFrom": "CAD",
    "currencyTo": "USD",
    "exchangeRate": 1.1123
}

Some tips for in-memory-database:

URL: /h2-console/

Querys:
SELECT * FROM EXCHANGE_RATE;

INSERT INTO EXCHANGE_RATE(ID, EXCHANGE_RATE, CURRENCY_FROM, CURRENCY_TO) VALUES(1, 0.8834, 'USD', 'EUR');
INSERT INTO EXCHANGE_RATE(ID, EXCHANGE_RATE, CURRENCY_FROM, CURRENCY_TO) VALUES(2, 1.1965, 'EUR', 'USD');
INSERT INTO EXCHANGE_RATE(ID, EXCHANGE_RATE, CURRENCY_FROM, CURRENCY_TO) VALUES(3, 1.3021, 'CAD', 'USD');
INSERT INTO EXCHANGE_RATE(ID, EXCHANGE_RATE, CURRENCY_FROM, CURRENCY_TO) VALUES(4, 0.7652, 'GBP', 'USD');
INSERT INTO EXCHANGE_RATE(ID, EXCHANGE_RATE, CURRENCY_FROM, CURRENCY_TO) VALUES(5, 0.9019, 'USD', 'CHF');
INSERT INTO EXCHANGE_RATE(ID, EXCHANGE_RATE, CURRENCY_FROM, CURRENCY_TO) VALUES(6, 0.0091, 'JPY', 'EUR');
