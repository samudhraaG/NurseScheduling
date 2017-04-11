<%@ include file="back4.jsp" %>
<div class="container">
<center><h4>CANCELLATION CONFORMATION</h4></center>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body>

<form action="../pcancelconform" method="post" class="form-group">
<label>Enter Reason</label>
<input type=hidden name="requestId" value='${requestId}' class="form-control">
<textarea name=note placeholder="Reason for Cancelling" class="form-control"></textarea><br><br>
<input type=submit value="Cancel" class="btn btn-default btn-block btn-primary">
</from>
</body>
</html>