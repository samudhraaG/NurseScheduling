<%@ include file="back2.jsp" %>
<div class="container">
<center><h4>ASSIGN TO HEALTHCARE PROFESSIONAL</h4></center>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
         <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body>
<form action="../../aassinconform" method="post" class="form-group">
<input type=hidden name="requestId" value='${requestId}'>

<lable>Select Health Care Professional</lable>
<select name="doctorId" class="form-control" required title="CHOOSE HEALTHCARE PROFESSIONAL">
<option disabled="disabled">Select</option>
<c:forEach items="${data}" var="element"> 
<c:if test="${element.doctorId==doctorId}">
<option value='${element.doctorId}' selected>${element.first_name}  ${element.last_name} </option>
</c:if>
<c:if test="${element.doctorId!=doctorId}">
<option value='${element.doctorId}'>${element.first_name}  ${element.last_name} </option>
</c:if>

</c:forEach>
</select>
<br>
<label>Note</label><textarea name="note" placeholder="Enter Note If have any" class="form-control"></textarea><br>
<input type=submit value="Assign" class="btn btn-default btn-block btn-primary">
</form>
</body>
</html>