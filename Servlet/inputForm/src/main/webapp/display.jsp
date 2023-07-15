<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Form Details</title>
<link href="Sample.css" rel="stylesheet" type="text/css" >
</head>
<body style='background-color:#d3d3d3;'>
<h1>display All details..</h1>
<pre>
	1.First Name: <%= request.getParameter("fName") %>
	2.Last Name: <%= request.getParameter("lName") %>
	2.Email-Id: <%= request.getParameter("email") %>
	3.Phone: <%= request.getParameter("phone") %>
	4.Password: <%= request.getParameter("password") %>
	5.Confirm Password: <%= request.getParameter("confirmPassword") %>
	6.Address: <%= request.getParameter("address") %>
	7.Pin-Code: <%= request.getParameter("pinCode") %>
	8.City: <%= request.getParameter("city") %>
	9.State: <%= request.getParameter("state") %>
	10.Country: <%= request.getParameter("country") %>
	11.Capital: <%= request.getParameter("capital") %>
	12.Device: <%= request.getParameter("device") %>
	13.Price: <%= request.getParameter("price") %>
	14.MFG Date: <%= request.getParameter("mfgDate") %>
	15.Bill Date: <%= request.getParameter("billDate") %>
	16.Current Date: <%= request.getParameter("currentDate") %>
	17.Product Name: <%= request.getParameter("productName") %>
	18.Costumer Name: <%= request.getParameter("costumerName") %>
	19.Store Name: <%= request.getParameter("storeName") %>
	20.Store address: <%= request.getParameter("storeAddress") %>
	21.Manager Name:  <%= request.getParameter("managerName") %>
	22.Vehicle Name: <%= request.getParameter("vehicleName") %>
	23.Vehicle Price: <%= request.getParameter("vehiclePrice") %>
	24.Vehicle Number: <%= request.getParameter("vehicleNumber") %>
	25.Vehicle Model: <%= request.getParameter("VehicleModel") %>
	26.Country Population: <%= request.getParameter("countryPopulation") %>
	27.Employee Id: <%= request.getParameter("empId") %>
	28.Employee Name: <%= request.getParameter("empName") %>
	29.Company Name: <%= request.getParameter("companyName") %>
	30.Employee Age: <%= request.getParameter("empAge") %>
	31.Employee Salary: <%= request.getParameter("empSalary") %>
	32.Employee Type: <%= request.getParameter("empType") %>
	34.Student Name: <%= request.getParameter("studentName") %>
	35.Student Roll: <%= request.getParameter("studentRoll") %>
	36.Branch: <%= request.getParameter("branch") %>
	37.College Name: <%= request.getParameter("collegeName") %>
	38.Teacher Name: <%= request.getParameter("teacherName") %>
	39.Subject: <%= request.getParameter("subject") %>
	40.Total Faculty: <%= request.getParameter("facultyNumber") %>
	41.Total Student: <%= request.getParameter("totalStudent") %>
	42.Admission Date: <%= request.getParameter("admissionDate") %>
	43.Pass-out Year: <%= request.getParameter("passOutYear") %>
	44.Father Name: <%= request.getParameter("fatherName") %>
	45.Mother Name: <%= request.getParameter("motherName") %>
	46.College Address: <%= request.getParameter("collegeAddress") %>
	47.College Code: <%= request.getParameter("collegeCode") %>
	48.College Type: <%= request.getParameter("collegeType") %>
	49.Network Operator: <%= request.getParameter("networkOperator") %>
	50.Internet Speed: <%= request.getParameter("networkSpeed") %>
	51.Pack Price: <%= request.getParameter("packPrice") %>
	52.Pack Valid Date: <%= request.getParameter("packDate") %>
	53.Mobile Company: <%= request.getParameter("mobileCompany") %>
	54.Mobile Storage: <%= request.getParameter("mobileStorage") %>
	55.Mobile Price: <%= request.getParameter("mobilePrice") %>
	56.Bus Number: <%= request.getParameter("busNumber") %>
	57.Train Number: <%= request.getParameter("trainNumber") %>
	58.Flight Number: <%= request.getParameter("flightNumber") %>
	59.Bike Number: <%= request.getParameter("BikeNumber") %>
	60.Car Number: <%= request.getParameter("CarNumber") %>
	61.Building Name: <%= request.getParameter("buildingName") %>
	62.House Number: <%= request.getParameter("houseNumber") %>
	63.Flat Type: <%= request.getParameter("flatType") %>
	64.Flat Price: <%= request.getParameter("flatPrice") %>
	65.Friend Name: <%= request.getParameter("friendName") %>
</pre>	
</body>
</html>