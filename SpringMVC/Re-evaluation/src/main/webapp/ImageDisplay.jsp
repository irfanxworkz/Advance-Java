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
	</nav>
	<h1 style="color: maroon; text-align: center;">Submission Form</h1>
	
	<form action="fileDownload" method="get">
	<pre>
		File Name <input type="text" name="fileName" />
		Content Type <input type="text" name="contentType" /> 
		
			<input type="submit" value="Download" />
	</pre>
	</form>
	
</body>
</html>