package controller;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.CurrencyHeader;

public class ControllerServlet extends HttpServlet {
	ArrayList<String> currencies;
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ControllerServlet() {
		super();
		this.currencies = CurrencyHeader.getCurrencies();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)	
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("currency",this.currencies);
		request.setAttribute("result", CurrencyHeader.currencyConverter(request.getParameter("selectCurrency"),
																		request.getParameter("inputCurrency"),
																		request.getParameter("selectToCurrency")));
		request.setAttribute("test", request.getParameter("selectCurrency"));
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
