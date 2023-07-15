<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Application Details</title>
<link  rel="stylesheet" href="Sample.css">
</head>
<body style='background-color:#d3d3d3;'>
		<h1 style="color:blue">Contact Application Details...</h1>
	<form action="Welcome.jsp">
	<pre>
	
		 ${msg }
<ul>
  <li>Name: ${name }</li>
  <li>Email: ${email }</li>
	<li>Country: ${country }</li>
	<li>Mobile: ${mobile }</li>
	<li>Type: ${type }</li>
		<li>Description: ${desc }</li>
</ul>	
		<input type="submit" value="Goto Contact Application" style="background-color: green;">
	</pre>
	</form>
</body>
</html>