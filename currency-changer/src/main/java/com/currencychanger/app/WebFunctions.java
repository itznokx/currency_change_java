package WebFunctions;

import CurrencyHeader.*;
import java.util.*;
import org.jsoup.Jsoup;
import org.jsoup.helper.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.File;
import java.io.IOException;

public class WebFunctions {
	Document doc;

	WebFunctions(File htmlFile){
		try{
			this.doc = Jsoup.parse(htmlFile);
		}catch(IOException e){
		}
		
	}
}
