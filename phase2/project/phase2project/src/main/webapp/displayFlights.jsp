<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Display All flights</h3><br/>
	
	
	<form action="buyingTicket" method="post">
	enter the flight id <input type="text" name="fID">
	<input type="submit" value="Submit"><br/>
	</form>
	
	
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

	<table border="2">
		<tr>
			<th>flight id</th>
			<th>airport</th>
			<th>from</th>
			<th>to</th>
			<th>time</th>
			<th>price</th>
		</tr>
		<c:forEach var="obj" items="${requestScope.list}">
			<c:if test="${obj.from_c eq requestScope.from_c}">
				<c:if test="${obj.to_c eq requestScope.to_c}">
					<tr>
						<td>${obj.fId}</td>
						<td>${obj.airportName}</td>
						<td>${obj.from_c}</td>
						<td>${obj.to_c }</td>
						<td>${obj.fTime }</td>
						<td>${obj.fPrice }</td>
					</tr>
				</c:if>
			</c:if>

		</c:forEach>
	</table>


</body>
</html>