import java.lang.Object;
import java.util.Currency;
import java.util.Locale;

public class CurrencyHeader{

	public static Currency testCurrency (String language,String country2L) {
		Locale country = new Locale(language,country2L);
		Currency moneyCurrency = Currency.getInstance(country);
		return moneyCurrency;
	}

}

