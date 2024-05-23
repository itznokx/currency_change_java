<html>
	<head>
	<title>Currency Converter Java</title>
	</head>
	<body>
		<h1>Currency Converter</h1>
		<h3><%= request.getRemoteAddr()%></h3>
		<br><br>
		<label> Actual currency value
		<select id="inputCurrency" name="currencyList">
			<option value="" disabled selected> Select your actual currency  </option>
		</select>
		</label>
		<br><br><br>
		<label> To currency value
		<select id="inputToCurrenty" name="currencyList">
			<option value="" disabled selected> Select your desired currency  </option>
		</select>
		</label>
		<label>
			<button type="button">Calculate</button>
		</label>
	</body>
</html>
