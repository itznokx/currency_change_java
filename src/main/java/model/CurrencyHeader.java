package model;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Currency;
import java.util.Locale;

import org.apache.tomcat.jakartaee.commons.io.IOUtils;
import org.json.JSONObject;

public class CurrencyHeader {
	static String urlJsonFile = "https://api.currencyfreaks.com/v2.0/rates/latest?apikey=YOUR_API_KEY_HERE";
	public static String currencyConverter(	String actualCurrency, 
											String amountToConvert, 
											String desiredCurrency) throws IOException {
		
		// Get URL type from urlJsonFile
		URL jsonURL = new URL (urlJsonFile);
		// Transform json file "downloaded" from urlJsonFile. see: https://currencyfreaks.com/
		String jsonString = IOUtils.toString(jsonURL,Charset.forName("UTF-8"));
		//Transform string json file to JSONObject (org.json api) 
		JSONObject jsonRates = new JSONObject(jsonString);
		//Get rates map from JSONObject (this works based on currencyfreaks json model)
		jsonRates = jsonRates.getJSONObject("rates");
		//UGLY CODE SORRY
		if (actualCurrency == "" || actualCurrency == "null" || actualCurrency == "placeholder" ||
			desiredCurrency == "" || desiredCurrency == "null" || desiredCurrency == "placeholder" ||
			amountToConvert == "" || amountToConvert == null) {
			return "Invalid Operation";
		}
		else {
			// CurrencyFreaks json modedl is USD based -> amount convert to usd and then convert to desired currency :)
			Double exchangeValor = Double.parseDouble(jsonRates.getString(actualCurrency))*
								   Double.parseDouble(amountToConvert)*
								   Double.parseDouble(jsonRates.getString(desiredCurrency));
			return String.valueOf(exchangeValor);
		}
	}
	
	public static ArrayList<String> getCurrencies() {
		Locale[] locales = Locale.getAvailableLocales();
		ArrayList<String> sortedCurrencies = new ArrayList<String>();
		for (Locale l:locales) {
			try {
				Currency c = Currency.getInstance(l);
				if (c!=null) {
					String currencyCode = c.getCurrencyCode();
					if (sortedCurrencies.contains(currencyCode) == false)
						sortedCurrencies.add(currencyCode);
				}
			}catch(Exception e) {
				
			}
		}
		Collections.sort(sortedCurrencies);
		return sortedCurrencies;
	}
}
