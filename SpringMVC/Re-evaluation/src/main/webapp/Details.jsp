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
	<span style="color: green; text-align: 40px;">${msg }</span>
	
	<pre style="border: solid 2px; margin-left: 120px; margin-right: 120px; background-color: rgb(235, 208, 148)">
		Student Name :${dtos.studentName }
		
		College Name :${dtos.collegeName }
		
		Subject :${dtos.subject }
		
		Marks obtained :${dtos.marks }
		 
		File Name:${dtos.fileName }
		
	</pre>
	
</body>
</html>