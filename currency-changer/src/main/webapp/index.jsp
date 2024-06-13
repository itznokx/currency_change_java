<%@ page import="java.util.Date"%>
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
			<input type="submit" value="Calculate">
		</label>
		<label>
			<h3 id="resultado">NULL</h3>
		</label>
	</body>
	
</html>