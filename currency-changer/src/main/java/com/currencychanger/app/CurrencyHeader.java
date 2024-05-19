package CurrencyHeader;

import java.lang.Object;
import java.util.Currency;
import java.util.Locale;
import javax.money.*;
public class CurrencyHeader{

	public static Currency testCurrency (String language,String country2L) {
		CurrencyUnit usd = Monetary.getCurrency("USD");
		Locale country = new Locale(language,country2L);
		Currency moneyCurrency = Currency.getInstance(country);
		return moneyCurrency;
	}

}

