<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>display details</title>
<link  rel="stylesheet" href="Sample.css">
</head>
<body style='background-color:#d3d3d3;'>

	<a>Post Method is done</a>
	<h1>User Data</h1>
	<h3>Company : ${Company }</h3>
<pre>
	Name: ${fName } ${lName }
	Account Number: ${acNo }
	Password: ${Pass1 }
	NextName: ${name }
	
	<a href="transfer.jsp"><input type="submit" value="Transfer"></a>
</pre>	

</body>
</html>