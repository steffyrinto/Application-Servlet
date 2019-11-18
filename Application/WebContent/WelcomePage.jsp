
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


</head>
<body>
<form action="">
	<%@page import="java.util.*" %>
<% List mydata= (List)request.getAttribute("data");%>

	<h3>Username :<%=" "+mydata.get(0) %></h3>
	<h3>Password :<%=" "+mydata.get(1) %></h3>
	<h3>RePassword :<%=" "+mydata.get(2) %></h3>
	<h3>Collegename :<%=" "+mydata.get(3) %></h3>
	<h3>Email :<%=" "+mydata.get(4) %></h3>
	<h3>Mobilenumber :<%=" "+mydata.get(5) %></h3>

</form>
</body>
</html>