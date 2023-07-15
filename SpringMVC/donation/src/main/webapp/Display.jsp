<!-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DonarDetails</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body style="background-color: #e3f2fd;">

	<h1 style="color: blue;">Blood Donate Details...</h1>
	
	<pre>
			<span style="color: green;"> ${PersonName }</span>
			Blood Group: ${BloodGroup }
			Age: ${Age }
			Contact: ${Contact }
			Weight: ${Weight }
			Donate Date: ${DonationDate }
			Address: ${Address }
	</pre>
	

</body>
</html>

-->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Re-evaluation</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="Simple.css">
</head>
<body>
	<nav class="navbar navbar-dark bg-dark justify-content-between">
		<a href="Evaluation.jsp" class="navbar-brand">Home</a>
		<a href="list" class="navbar-brand">AllListView</a>
	</nav>
	
	<h1 style="color: red; text-align: center;">Submission Form</h1>
	<span style="color: green; text-align: 40px;">${msg1 }</span>
	
	<pre style="border: solid 2px; margin-left: 120px; margin-right: 120px; background-color: rgb(235, 208, 148)">
		Person Name: :${dtos.pName }
		
		Blood Group:${dtos.group }
		
		Age : ${dtos.age }
		
		Contact: ${dtos.Contact }
		
		Weight: ${dtos.weight }
		
		Donation Date : ${dtos.donationDate }
		 
		Address :${dtos.address }
		
		File Name:${dtos.fileName }
		
		ContentType :${dtos.contentType }
		
		File Size:${dtos.fileSize }
		
	</pre>
	
</body>
</html>