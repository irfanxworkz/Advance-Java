<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BloodDonationForm</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
</head>

<body style="background-color: #e3f2fd;">
	<nav class="navbar navbar-dark bg-dark justify-content-between">
		<a class="navbar-brand">Profile</a> <a class="navbar-brand">Home</a> <a
			class="navbar-brand">Display</a> <a class="navbar-brand">AllListView</a>

		<form class="form-inline">
			<input class="form-control mr-sm-2" type="search"
				placeholder="Search" aria-label="Search">
			<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
		</form>
	</nav>

	<h1 style="color: green;">Blood Donation Form...</h1>

	<span style="color: green;">${msg1}</span>

	<c:forEach items="${errors}" var="error">
		<span style="color: red;">${error.defaultMessage}</span>
		<br>
	</c:forEach>

	<form action="donate" method="post" enctype="multipart/form-data">
		<pre>
	Person Name: <input type="text" name="pName">
	Blood Group: <select name="group">
		<option class="group">select</option>
		<option>A+</option>
		<option>AB+</option>
		<option>B+</option>
		<option>B-</option>
		<option>O-</option>
	</select>
	Person Age: <input type="number" name="age" value="${dto.age}">
	Contact No: <input type="number" name="contact" value="${dto.contact}">
	Weight: <input type="number" name="weight" value="${dto.weight}">
	Date: <input type="date" name="donationDate"
				value="${dto.donationDate}">
	Address: 
		<textarea rows="3" cols="30" name="address"></textarea>
	Select File:<input type="file" name="file">
	
		<input type="submit" value="Send">
</pre>
	</form>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"
		integrity="sha384-fbbOQedDUMZZ5KreZpsbe1LCZPVmfTnH7ois6mU1QK+m14rQ1l2bGBq41eYeM/fS"
		crossorigin="anonymous"></script>
</body>
</html>