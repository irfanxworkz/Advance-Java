<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BarViewDetails</title>
<link  rel="stylesheet" href="Sample.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  
</head>
<body style='background-color: orange;'>

	<h1 style="color:blue">Display all Bar List</h1>

	  <h2 style="color:red;">Bar Table</h2>          
 <table class="table">
    <thead>
      <tr>
        <th>BarName</th>
        <th>BarLicence</th>
        <th>BarType</th>
        <th>BarLocation</th>
        <th>BarStaff</th>
        <th>BarStock</th>
        <th>BarAlcohol</th>
        <th>BarStatus</th>
        <th>BarStaff</th>
        <th>BarFeedback</th>
      </tr>
    </thead>
    <tbody>
	    <c:forEach var="entry" items= "${list }">
		      	<tr >     
		            <td style="color: white;"><c:out value="${entry.barName}" /></td>
		            <td style="color: green;"><c:out value="${entry.licenceNo}" /></td>
		            <td style="color: blue;"><c:out value="${entry.barType}" /></td>
		            <td style="color: yellow;"><c:out value="${entry.location}" /></td>
		            <td style="color: brown;"><c:out value="${entry.totalStaff}" /></td>
		            <td style="color: gold;"><c:out value="${entry.stock}" /></td>
		            <td style="color: red;"><c:out value="${entry.alcohol}" /></td>
		            <td style="color: grey;"><c:out value="${entry.status}" /></td>
		            <td style="color: red;"><c:out value="${entry.gender}" /></td>
		            <td style="color: wheat;"><c:out value="${entry.feedback}" /></td>
				</tr>
	      </c:forEach>
     
	</tbody>
</table>

</body>
</html>