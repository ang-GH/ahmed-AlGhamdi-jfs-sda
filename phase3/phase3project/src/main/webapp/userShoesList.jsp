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
	
	<table border="2">
		<tr>
			<th>shoe name</th>
			<th>description</th>
			<th>price</th>
			<th>Actions</th>

		</tr>
		<c:forEach var="obj" items="${requestScope.list}">

			<tr>
				<td>${obj.shoeName}</td>
				<td>${obj.description}</td>
				<td>${obj.price}$</td>
                <td><a href="buyShoe?shoeId=<c:out value='${obj.shoeId}' />&userId=<c:out value='${requestScope.userId}' />">BUY</a>
                

			</tr>
		</c:forEach>
	</table>
</body>
</html>