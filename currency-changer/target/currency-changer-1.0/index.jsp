<%@ page import ="org.jsoup.Jsoup"%>
<%@ page import ="org.jsoup.helper.*"%>
<%@ page import ="org.jsoup.nodes.Document"%>
<%@ page import ="org.jsoup.nodes.Element"%>
<%@ page import ="org.jsoup.select.Elements"%>
<%@ page import="java.util.Date"%>
<%@ page import="java.io.File,java.io.IOException" %>
<html> 
	<head>
	<title>Currency Converter</title>
	</head>
	<body>

		<h2>Currency Converter</h2>
		<p>Data de hoje: 
		<%
		Date data = new Date();
		data.toLocaleString();
		out.println(data);
		%>
		<br><br>
		<label> Actual currency value
		<select id="inputCurrency" name="currencyList">
			<option value="" disabled selected> Select your actual currency  </option>
		</select>
		</label>
		<br><br><br>
		<label> To currency value
		<select id="inputToCurrency" name="currencyList">
			<option value="" disabled selected> Select your desired currency  </option>
		</select>
		</label>
		<label>
			<button type="button">Calculate</button>
		</label>
		
	</body>
	
</html>
