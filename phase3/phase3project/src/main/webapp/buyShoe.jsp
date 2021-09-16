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

	<c:set var="shoe" value="${requestScope.shoe}"/>
	<form action="buyShoe" method="Post">
	<p>shoe name : ${shoe.shoeName}
	   shoe description : ${shoe.description}
	   shoe price : ${shoe.price}
	   </p>
	   <input type="hidden" value="${shoe.shoeId}" name="shoeId">
	   <input type="hidden" value="${requestScope.userId}" name="userId">
		 <input type="submit" value="confirm purchase">
	</form>
</body>
</html>