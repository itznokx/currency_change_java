package CurrencyHeader;

import java.lang.Object;
import java.util.Locale;
import javax.money.*;
public class CurrencyHeader{
	public static void currencyConverter (String actualCurrency,double amountToConvert,String desiredCurrency) {
		MonetaryAmount currencyActualMoney = Monetary.getDefaultAmountFactory().setCurrency(actualCurrency).setNumber(amountToConvert).create();
		ExchangeRateProvider rateProvider = MonetaryConversions.getExchangeRateProvider("IMF");
		CurrencyConversion conversion = rateProvider.getCurrencyConversion(desiredCurrency);
		MonetaryAmount convertedValor  = currencyActualMoney.with(conversion);
	}

}

