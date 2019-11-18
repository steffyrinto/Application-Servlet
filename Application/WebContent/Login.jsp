<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center><h1>Welcome to the login Portal</h1></center>
	<form action="LoginServlet" method="post">
	<table align="center">
	<tr>
	<td>${message}</td>
	</tr>
	<tr>
	<td><h3 align="left">Username</h3></td>
	<td><input type="text" align="center" name="Username" placeholder="Enter the Username"></td>
	</tr>
	<tr>
	<td><h3 align="left">Password</td>
	<td><input type="password" align="center" name="Password" placeholder="Enter the Password"></td>
	</tr>
	<tr>
	
	<td align="center"><input type="submit" name="submit" value="login" ></td>
	<td></td>
	</tr>
	
	
	</table>
	
	</form>

</body>
</html>