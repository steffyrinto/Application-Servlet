<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="RegisterServlet" method="post">
	<center><h2 style="color:Darkblue">Welcome to Registration Portal</h2></center>
<table align="center">
<tr >

<td></td>
<tr>
	<td><h3 align="left">Username</h3></td>
	<td><input type="text" name="Username" placeholder="Enter the Username" align="right"></td>
</tr> 

<tr>
	<td><h3 align="left">Password</h3></td>
	<td><input type="Password" align="center" name="Password" placeholder="Enter the password"></td>
</tr> 
<tr>
	<td><h3 align="left">Re-Password</h3></td>
	<td><input type="Password" align="center" name="RePassword" placeholder="Enter the password"></td>
</tr> 
<tr>
	<td><h3 align="left">Collegename</h3></td>
	<td><input type="text"  align="center" name="Collegename" placeholder="Enter the Collegename"></td>
</tr>
<tr>
	<td><h3 align="left">Email</h3></td>
	<td><input type="email"  align="center" name="Email" placeholder="Enter the Emailid"></td>
</tr>
<tr>
	<td><h3 align="left">MobileNumber</h3></td>
	<td><input type="text"  align="center" name="Mobilenum" placeholder="Enter the Mobile Number"></td>
</tr> 
<tr>
	<td><center><input type="submit" name="submit" value="Register"  ></center></td>
	<td></td>
</tr>
</table>
	</form>
	
</body>
</html>