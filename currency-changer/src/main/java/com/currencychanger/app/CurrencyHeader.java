package CurrencyHeader;

import java.util.Iterator;
import java.util.Set;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Currency;
import java.lang.Object;
import java.util.Locale;
import javax.money.*;
import javax.money.convert.MonetaryConversions;
import javax.money.convert.ExchangeRate;
import javax.money.convert.RateType;
import javax.money.convert.CurrencyConversion;
import javax.money.convert.ExchangeRateProvider;

public class CurrencyHeader{
	public static String currencyConverter (String actualCurrency,double amountToConvert,String desiredCurrency) {
		MonetaryAmount currencyActualMoney = Monetary.getDefaultAmountFactory().setCurrency(actualCurrency).setNumber(amountToConvert).create();
		ExchangeRateProvider rateProvider = MonetaryConversions.getExchangeRateProvider("ECB");
		CurrencyConversion conversion = rateProvider.getCurrencyConversion(desiredCurrency);
		MonetaryAmount convertedValor  = currencyActualMoney.with(conversion);
		return (convertedValor.toString());
	}
	public static ArrayList<String> getCurrencies (){

		Set<Currency> allCurrencies = Currency.getAvailableCurrencies();
		ArrayList<String> sortedCurrencies = new ArrayList<String>();
		try{
			for (Currency iter: allCurrencies){
				sortedCurrencies.add(iter.getCurrencyCode());
			}
		}
		catch(Exception e){
			System.out.println(e.toString());
		}
		Collections.sort(sortedCurrencies);
		return sortedCurrencies;	
	}	
}

