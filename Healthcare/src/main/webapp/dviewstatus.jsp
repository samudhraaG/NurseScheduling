<%@ include file="back3.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body>
<div class="container-fluid">
 <center><h4>PATIENT REQUESTS</h4></center>
<table class="table"><tr><th>Date Preference</th><th>Time Preference</th><th>Type of Request</th><th>Type of Service Requested</th><th>Location Preference</th><th>Gender Preference</th><th>Care Giver Preference</th><th>Language Preference</th><th>Description</th><th>Note</th><th>Status</th><th>Cancel</th><th>Approve</th></tr>
<c:forEach items="${data}" var="element">

<tr><td style="text-align:center;">${element.datee}</td><td style="text-align:center;">${element.timee}</td><td style="text-align:center;">${element.requestType}</td><td style="text-align:center;">${element.serviceRequestType}</td><td style="text-align:center;">${element.location}</td><td style="text-align:center;">${element.gender}</td><td style="text-align:center;"><a href="viewdoctor/${element.doctorId}" target="_new">${element.doctorId}</a></td><td style="text-align:center;">${element.language}</td><td style="text-align:center;">${element.description}</td><td style="text-align:center;">${element.note}</td><td style="text-align:center;">${element.status}</td><td style="text-align:center;">
<c:if test="${element.status=='Assigned to Healthcare Giver' ||element.status=='Accepted'}">
<a href="dcancel/${element.requestId}"><input type=button value="Cancel"></a>
</c:if></td><td>
<c:if test="${element.status=='Assigned to Healthcare Giver'}">
<a href="dassign/${element.requestId}/${element.doctorId}"><input type=button value="Accept"></a>
</c:if>
<c:if test="${element.status=='Accepted'}">
<a href="daccept/${element.requestId}/${element.doctorId}"><input type=button value="Make it Complete"></a>
</c:if>

</td>

</tr>
</c:forEach>
</table></div>
</body>
</html>