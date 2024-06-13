package br.servlets.currencychanger;

import CurrencyHeader.*;
import java.util.*;
import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.jsoup.Jsoup;
import org.jsoup.helper.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CCServlet extends HttpServlet {
	public static final long serialVersionUID = 1L;
	public static final String url = "index.jsp";
	CCServlet (){
		super();
	}
	protected void service (HttpServletRequest req,
							HttpServletResponse)
	throws ServletException,IOException{
		ArrayList<String> currencies = new ArrayList<String>();
		currencies = CurrencyHeader.getCurrencies();

	}
	protected void doGet(HttpServletRequest req,
						 HttpServletResponse res)
	throws ServletException,IOException{
		doPost(req,res);
	}
}