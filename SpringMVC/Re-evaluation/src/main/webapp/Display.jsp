<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
	<h1 style="color: maroon; text-align: center;">All Student List</h1>
	<table class="table" id="customers">
		<tr >
			<th>Name</th>
			<th>College Name</th>
			<th>Subject</th>
			<th>Marks Obtained</th>
			<th>File</th>
		</tr>
		
		<c:forEach items="${dtos }" var="dto">
			<tr>
				<td>${dto.studentName }</td>
				<td>${dto.collegeName }</td>
				<td>${dto.subject }</td>
				<td>${dto.marks }</td>
				<td><a target="_blank" href="fileDownload?fileName=${dto.fileName }&contentType=${dto.contentType }">
				 ${dto.fileName }</a></td>
			</tr>
		</c:forEach>
		
	</table>

</body>
</html>