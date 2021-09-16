<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>hello</h1>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

	<table border="2">
		<tr>
			<th>user name</th>
			<th>password</th>
			<th>Actions</th>

		</tr>
		<c:forEach var="obj" items="${requestScope.list}">

			<tr>
				<td>${obj.userName}</td>
				<td>${obj.password}</td>
				
                <td><a href="editUser?id=<c:out value='${obj.id}' />">Edit</a> &nbsp;&nbsp; <a href="deleteUser?id=<c:out value='${user.id}' />">Delete</a></td>
                </tr>

			</tr>
		</c:forEach>
	</table>
</body>
</html>