<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bar Form</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

.topnav {
  overflow: hidden;
  background-color: #333;
}

.topnav a {
  float: left;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.topnav a:hover {
  background-color: #ddd;
  color: black;
}

.topnav a.active {
  background-color: #04AA6D;
  color: white;
}
</style>
</head>
<body style='background-color: orange;'>

<div class="topnav">
  <a class="active" href="Landing.jsp">Home</a>
  <a href="ViewDetails.jsp">goto view</a>
  <a href="save">goto save</a>
</div>

<h1 style="color:blue">Bar Application Form...</h1>

<span style="color: green;">${msg }</span>

<c:forEach items="${errorMsg }" var="error">
<span style="color: red;">${error.defaultMessage }</span><br>
</c:forEach>

<form action="view" method="post">
<pre>
							<input type="submit" value="View" style="background-color: green;">
</pre>
</form>

	<form action="save" method="post">
<pre>
		1.Bar Name:<input type="text" name="barName" style="background-color: yellow;">
		2.Bar Licence No: <input type="text" name="licenceNo" style="background-color: yellow;">
		3.Bar type<input type="text" name="barType" style="background-color: yellow;">
		4.Bar Location <input type="text" name="location" style="background-color: yellow;">
		5.Total Staff: <input type="number" name="totalStaff" style="background-color: yellow;">
		6.Stock: <select name="stock" style="background-color: yellow;">
			<option >Select Item</option>
			<option value="mineralWater">Mineral Water</option>
	 		<option value="softDrink">Soft Drink</option>
	  		<option value="snackFoods">Snack Food </option>
		</select>
		7.Alcohol Type:<select name="alcohol" style="background-color: yellow;">
			<option >Select Alcohol</option>
			<option value="beer">Beer</option>
	 		<option value="wine">Wine</option>
	  		<option value="liquor">Liquor </option>
		</select>
		8.Open/Close:
		<input type="checkbox" name="status"><label for="status">Open</label>
		9.Gender:
		<input type="radio" name="gender" value="male"> Male
		<input type="radio" name="gender" value="female"> Female
		
		10.FeedBack:
			<textarea name="feedback" rows="4" cols="23" style="background-color: yellow;">Please Write feedback</textarea>
			
		<input type="submit" value="Save" style="background-color: green;">
</pre>
	</form>

</body>
</html>