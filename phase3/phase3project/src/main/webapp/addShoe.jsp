<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>add shoe</h3>
	<form action="addShoe" method="post">
		<label>shoe Name</label> <input type="text" name="shoeName"><br />
		<label>shoe description</label> <input type="text" name="description"><br />
		<label>shoe price</label> <input type="text" name="price"><br />
		<input type="submit" value="Submit">
	</form>
</body>
</html>