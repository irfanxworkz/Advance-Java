<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UploadPicture</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>

<body style="background-color: #e3f2fd;">
<nav class="navbar navbar-dark bg-dark justify-content-between">
  <a class="navbar-brand">Profile</a>
  <a class="navbar-brand">Home</a>
  <a class="navbar-brand">Display</a>
  <a class="navbar-brand">AllListView</a>
  
  <form class="form-inline">
    <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
  </form>
</nav>

<h1 style="color: green;">Blood Donation Form...</h1>

<form action="pic" method="post" enctype="multipart/form-data">
<pre>
	Person Name: <input type="text" name="pName" >
	Person Age: <input type="number" name="age" >
	Contact No: <input type="number" name="contact" >
	Weight: <input type="number" name="weight" >
	Select File:<input type="file" name="file">
	
		<input type="submit" value="Send">
</pre>
</form>

</body>
</html>