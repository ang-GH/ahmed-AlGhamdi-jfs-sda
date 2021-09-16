<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>purchases page</h1>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

	<table border="2">
		<tr>
			<th>purchase id</th>
			<th>buyer id</th>
			<th>buyer name</th>
			<th>shoe id</th>
			<th>shoe name</th>
			<th>price</th>


		</tr>
		<c:forEach var="purchase" items="${requestScope.purchaseList}">
		
			
				
					<tr>
						<td>${purchase.purchaseId}</td>
						<td>${purchase.userId}</td>
						
						<c:forEach var="user" items="${requestScope.userList}">
						<c:if test="${purchase.userId == user.id}">
							<td>${user.userName}</td>
						</c:if>
						</c:forEach>
						
						<td>${purchase.shoeId}</td>
						
						<c:forEach var="shoe" items="${requestScope.shoeList}">
						<c:if test="${purchase.shoeId == shoe.shoeId}">
							<td>${shoe.shoeName}</td>
							<td>${shoe.price}$</td>
						</c:if>
						</c:forEach>

					</tr>
				
			</c:forEach>
		
	</table>

</body>
</html>