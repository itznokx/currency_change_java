<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html> 
	<head>
	<title>Currency Converter</title>
	</head>
	<body>
	 <form action="CurrencyChanger.do" method="POST">
		<h2>Currency Converter</h2>
		<br><br>
		<label> Actual currency value
		<select id="inputCurrency" name="currencyList">
			<option value="" disabled selected> Select your actual currency  </option>
		</select>
		<input type="number">
		</label>
		<br><br><br>
		<label> To currency value
		<select id="inputToCurrency" name="currencyList">
			<option value="" disabled selected> Select your desired currency  </option>
		</select>
		</label>
		<label>
			<input type="submit" value="Calculate">
		</label>
		<br><br>
		<label>
			<h3 id="resultado">NULL</h3>
		</label>
	 </form>
	</body>
	
</html>