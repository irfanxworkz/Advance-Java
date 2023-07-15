<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bank Home Page</title>
<link  rel="stylesheet" href="Sample.css">
</head>
<body style='background-color:#d3d3d3;'>
	<h1>fill form details</h1>
	<form action="bank" method="post">
<pre>
	First Name: <input type="text" name="fName">
	Last Name: <input type="text" name="lName">
	Account Number: <input type="number" name="acNo">
	Password <input type="password" name="Pass1">
	Confirm Password: <input type="password" name="Pass2">
	<input type="submit" value="Send">
</pre>	
	</form>
		

</body>
</html>