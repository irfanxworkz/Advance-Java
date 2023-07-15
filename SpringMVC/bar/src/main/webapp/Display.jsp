<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bar Details</title>
<link  rel="stylesheet" href="Sample.css">
</head>
<body style='background-color: orange;'>
		<h1 style="color:blue">All Bar Details...</h1>
	<form action="Landing.jsp">
<pre>	
		 ${msg }

 	BarName: ${BarName }
  	BarLicence: ${BarLicence }
	BarType: ${BarType }
	BarLocation: ${BarLocation }
	BarStaff: ${BarStaff }
	BarStock: ${BarStock }
	BarAlcohol: ${BarAlcohol }
	BarStatus: ${BarStatus }
	BarStaff: ${BarStaff }
	BarFeedback: ${BarFeedback }
	
		<input type="submit" value="Landing Page" style="background-color: green;">
</pre>
	</form>
</body>
</html>