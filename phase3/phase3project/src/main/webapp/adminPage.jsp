<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>admin page</h1>
<form action="adminPurchasesList" method="Post">
		<input type="submit" value="Purchases list">
	</form>
	
	<form action="shoesServlet" method="Post">
		<input type="submit" value="Shoes list">
	</form>
	
	<form action="usersServlet" method="Post">
		<input type="submit" value="Users list">
	</form>
</body>
</html>