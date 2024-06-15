package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Currency;
import java.util.Set;

import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.money.convert.CurrencyConversion;
import javax.money.convert.ExchangeRateProvider;
import javax.money.convert.MonetaryConversions;

public class CurrencyHeader {
	public static String currencyConverter(String actualCurrency, Double amountToConvert, String desiredCurrency) {
		MonetaryAmount currencyActualMoney = Monetary.getDefaultAmountFactory().setCurrency(actualCurrency)
				.setNumber(amountToConvert).create();
		ExchangeRateProvider rateProvider = MonetaryConversions.getExchangeRateProvider("ECB");
		CurrencyConversion conversion = rateProvider.getCurrencyConversion(desiredCurrency);
		MonetaryAmount convertedValor = currencyActualMoney.with(conversion);
		return (convertedValor.toString());
	}

	public static ArrayList<String> getCurrencies() {

		Set<Currency> allCurrencies = Currency.getAvailableCurrencies();
		ArrayList<String> sortedCurrencies = new ArrayList<String>();
		try {
			for (Currency iter : allCurrencies) {
				sortedCurrencies.add(iter.getCurrencyCode());
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		Collections.sort(sortedCurrencies);
		return sortedCurrencies;
	}
}
