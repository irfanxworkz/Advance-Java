<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>KUD</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="Simple.css">
</head>
<body>
	
	<nav class="navbar navbar-dark bg-dark justify-content-between">
		<a href="Details.jsp" class="navbar-brand">Details</a>
		<a href="ImageDisplay.jsp" class="navbar-brand">Download Image</a>
		<a href="list" class="navbar-brand">AllListView</a>
		<form class="form-inline">
			<input class="form-control mr-sm-2" type="search"
				placeholder="Search" aria-label="Search">
			<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
		</form>
	</nav>
	
	<h3 style="text-align: center; color: red;">Rajasthan Technical Univarsity Re-Evaluation Form</h3>
	
	<c:forEach items="${errors }" var="error">
		<span style="color: red;">${error.defaultMessage }</span><br>
	</c:forEach>
	<form style="border: solid thin; margin-left: 150px; margin-right: 150px" action="sub" method="post" enctype="multipart/form-data">
	<pre>
		 
		Student Name: <input type="text" name="studentName" value="${dto.studentName }" />
		
		College Name: <input type="text" name="collegeName" value="${dto.collegeName }" />
		
		Subject : <select name="subject">
			<option value="">select</option>
			<option value="english">English</option>
			<option value="chemistry">Chemistry</option>
			<option value="physics">Physics</option>
			<option value="computer">Computer</option>
			<option value="math">Math</option>
			<option value="electronic">Electronic</option>
		</select>
		
		Total Marks Obtained: <input type="number" name="marks" value="${dto.marks }" />
		
		Upload Marks Card: <input type="file" name="file" />
		
		<input type="submit" value="submit" />
	</pre>
	</form>
	
</body>
</html>