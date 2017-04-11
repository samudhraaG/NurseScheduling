<%@ include file="back3.jsp" %>
<div class="container">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<center><h4>PATIENT REQUEST CANCELLATION</h4></center>
<body>
<form action="../dcancelconform" method="post" class="form-group">
<input type=hidden name="requestId" value='${requestId}'>
<textarea name=note placeholder="Reason for Cancelling" class="form-control"></textarea><br><br>
<input type=submit value="Cancel" class="btn btn-default btn-block btn-primary">
</from>
</body>
</html>