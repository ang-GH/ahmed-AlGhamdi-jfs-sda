<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<h4>
	flight id :${requestScope.flightInfo.fId}<br/>
	flight airport Name :${requestScope.flightInfo.airportName}<br/>
	flight from :${requestScope.flightInfo.from_c}<br/>
	flight to :${requestScope.flightInfo.to_c}<br/>
	flight Time :${requestScope.flightInfo.fTime}<br/>
	flight Price :${requestScope.flightInfo.fPrice}<br/>
	</h4>
	<form action="succesPage" method="post">
	first name <input type="text" name="firstName"><br/>
	last name  <input type="text" name="lastName"><br/>
	email  <input type="text" name="email"><br/>
	phone number  <input type="text" name="phone"><br/>
	
	<input type="submit" value="Submit">
	</form>
	
</body>
</html>