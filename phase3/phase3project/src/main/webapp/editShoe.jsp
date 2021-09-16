<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>edit shoe</h3>
	<form action="editShoe" method="post">
		<input type="hidden" value="${shoe.shoeId}" name="id">
		<label>shoe Name</label> <input type="text" value="${shoe.shoeName}" name="shoeName"><br />
		<label>shoe description</label> <input type="text" value="${shoe.description}" name="description"><br />
		<label>shoe price</label> <input type="text" value="${shoe.price}" name="price"><br />
		<input type="submit" value="Submit">
	</form>
</body>
</html>