<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Currency Changer</title>

</head>
<body>
		<form action="ControllerServlet" method="post">
		
		<select name="selectCurrency">
			<option value="placeholder" disable selected>Select your actual currency</option>
  			<c:forEach items="${currency}" var="currencyName">
    			<option value="${currencyName}">${currencyName}</option>
  			</c:forEach>
		</select>
		<img src="arrow.png" height="36" width="64">
		<select name="selectToCurrency">
			<option value="placeholder" disable selected>Select your desired currency</option>
  			<c:forEach items="${currency}" var="currencyName">
    			<option value="${currencyName}">${currencyName}</option>
  			</c:forEach>
		</select>
		<br>
		
		<br>
		<input type='number' step='0.01' name="inputCurrency">
		<label>
		 <input type="submit">
		</label>
		<h2>Result: ${result}</h2>
		</form>
		<br><br>
		<label>
		
		</label>
		<br><br>


	
</body>
</html>