
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contact</title>
<link  rel="stylesheet" href="Sample.css">
</head>
<body style='background-color: orange;'>
<h1 style="color:blue">Contact Application</h1>
<form action="view" method="post">
<pre>
							<input type="submit" value="View" style="background-color: green;">
</pre>
</form>
<form action="contact" method="post">
	<pre>													
	
		Name: <input type="text" name="name" style="background-color: yellow;">
		
		Email: <input type="email" name="email" style="background-color: yellow;">
		
		Country: <select name="country" style="background-color: yellow;">
			<option >Select country</option>
			<option value="india">India</option>
	 		<option value="germeny">Germany</option>
	  		<option value="usa">USA</option>
	  		<option value="uae">UAE</option>
		</select>
		
		Mobile: <input type="number" name="mobile" style="background-color: yellow;">
		
		Type: <select name="type" style="background-color: yellow;">
			<option >Select type</option>
	  		<option value="parttime">Part-time</option>
	  		<option value="fulltime">Full-time</option>
		</select>
		
		Description:
			<textarea name="desc" rows="4" cols="23" style="background-color: yellow;">write some description</textarea>
			
		<input type="submit" value="Save" style="background-color: green;">	
			
	</pre>
</form>	
</body>
</html>