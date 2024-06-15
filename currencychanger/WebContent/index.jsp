<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Currency Changer</title>
</head>
<body>
	<form action="main" method="POST">
		<label>
		<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
			<select>
				<option value="placeholder" disabled selected>Change your actual currency</option>
				<c:forEach items="${currencyList}" var="currency" varStatus="loop">
					<option value="${loop.index}">${currency}</option>
				</c:forEach>
		</select>
		</label>
		<br><br>
		<label>
			<select>
				<option value="placeholder" disabled selected>Change your desired currency</option>
			</select>
		</label>
	</form>
</body>
</html>