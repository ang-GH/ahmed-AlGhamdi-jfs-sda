<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>user page</h1>
	<form action="userShoesList" method="Post">
		<input type="hidden" name="userId" value="${requestScope.userId}">
		<input type="submit" value="Shoes list">
	</form>
	
	<form action="userPurchases" method="Post">
		<input type="hidden" name="userId" value="${requestScope.userId}">
		<input type="submit" value="purchasess list">
	</form>
</body>
</html>