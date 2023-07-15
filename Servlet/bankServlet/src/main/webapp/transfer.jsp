<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Transfer</title>
<link  rel="stylesheet" href="Sample.css">
</head>
<body style='background-color:#d3d3d3;'>
	<h3>Company : ${Company }</h3>
	<h1>Transfer Page</h1>
	<form action="bank" method="post">
<pre>
	From: <input type="text" name="sender">
	To: <input type="text" name="receiver">
	Amount: <input type="text" name="amount">
	<a href="amount.jsp">amount</a>
</pre>	
	</form>
</body>
</html>