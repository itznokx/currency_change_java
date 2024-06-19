<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Currency Changer</title>
</head>
<body>
	<form action="ControllerServlet" method="POST">
		<label>
		<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
			<select name="selectCurrency">
				<option value="placeholder" disabled selected>Change your actual currency</option>
				<c:forEach items="${currencyList}" var="currency" varStatus="loop">
					<option value="${loop.index}">${currency}</option>
				</c:forEach>
		</select>
		<br>
		<input type='number' step='0.01' name="inputCurrency">
		</label>
				
		<br><br>
		<label>
		<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
			<select name="selectToCurrency">
				<option value="placeholder" disabled selected>Change your desired currency</option>
				<c:forEach items="${currencyToList}" var="currencyTo" varStatus="loop">
					<option value="${loop.index}">${currencyTo}</option>
				</c:forEach>
		</select>
		</label>
		<br><br>
		<label>
		 <input type="submit">
		</label>
	</form>
</body>
</html>