<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="editUser" method="post">
		<input type="hidden" value="${user.id}" name="id">
		<label>user Name</label> <input type="text" value="${user.userName}" name="userName"><br />
		<label>user password</label> <input type="text" value="${user.password}" name="password"><br />
		<input type="submit" value="Submit">
	</form>

</body>
</html>