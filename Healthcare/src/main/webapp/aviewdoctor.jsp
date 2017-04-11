<%@ include file="back2.jsp" %>
   
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body>
 <div class="container">
 <center><h4>HEALTHCARE PROFESSIONALS</h4></center>
<table class="table"><tr><th>First Name</th><th>Last name</th><th>Email</th><th>Gender</th><th>Phone number</th><th>Address</th><th>Postal code</th><th>Languages known</th><th>Skill Set</th><th>Timings</th></tr>
<c:forEach items="${data}" var="element"> 

<tr><td>${element.first_name}</td><td>${element.last_name}</td><td>${element.email}</td><td>${element.gender}</td><td>${element.phone}</td><td>${element.address}</td><td>${element.postal_code}</td><td>${element.languages}</td><td>${element.skills}</td><td>
<!-- <input type=button value=Timings onclick="changeImageOnClick(event,'${element.sunday}','${element.monday}','${element.tuesday}','${element.wednesday}','${element.thursday}','${element.friday}','${element.saturday}','${element.sunday_time}','${element.monday_time}','${element.tuesday_time}','${element.wednesday_time}','${element.thursday_time}','${element.friday_time}','${element.saturday_time}')">  -->
<a href="viewdoctor/${element.doctorId}" target="_new"><input type=button value=Timings></a>
</td></tr>
</c:forEach>
</table>
</div>

</body>
</html>