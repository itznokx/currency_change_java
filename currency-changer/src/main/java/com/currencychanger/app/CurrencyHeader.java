package CurrencyHeader;

import java.util.Set;
import java.util.HashSet;
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
	public static Set<Currency> getCurrencies (){
		Set<Currency> allCurrencies = new HashSet<Currency> ();
		Locale[] allLocales = Locale.getAvailableLocales();
		try{
			for (Locale iter : allLocales){
				Currency auxCurrency = Currency.getInstance(iter);
				if (auxCurrency!=null){
					allCurrencies.add(auxCurrency);
				}
			}
		}
		catch(Exception e){
				System.out.println(e.toString());
			}
		return allCurrencies;	
	}	
}

