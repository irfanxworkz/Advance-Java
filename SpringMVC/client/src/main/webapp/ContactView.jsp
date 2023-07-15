<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link  rel="stylesheet" href="Sample.css">
</head>
<body style='background-color:#d3d3d3;'style='background-color:#d3d3d3;'>

	<h1 style="color:blue">Display all list</h1>

	<h1 style="color:blue">${msg }</h1>	

<ul>
	<c:forEach var="item" items="${list }">
	<li style="color:blue">${item }</li>
	</c:forEach>
</ul>
</body>
</html>