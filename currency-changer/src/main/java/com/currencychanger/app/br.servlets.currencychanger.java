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


class CCServlet extends HttpServlet {
	public static final long serialVersionUID = 1L;
	public static final String url = "index.jsp";
	public CCServlet (){
		super();
	}
	protected void service (HttpServletRequest req,
							HttpServletResponse res)
	throws ServletException,IOException{
		ArrayList<String> currencies = new ArrayList<String>();
		currencies = CurrencyHeader.getCurrencies();

	}
	protected void doGet(HttpServletRequest req,
						 HttpServletResponse res)
	throws ServletException,IOException{
		doPost(req,res);
	}
	protected void doPost(HttpServletRequest req,
						 HttpServletResponse res)
	throws ServletException,IOException{
		//TODO
	}
}