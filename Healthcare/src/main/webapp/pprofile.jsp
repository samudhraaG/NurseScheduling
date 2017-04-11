<%@ include file="back4.jsp" %>
<div><center><h4>VIEW AND UPDATE PROFILE</h4></center></div>
<div class="col-xs-6 col-sm-6 col-md-4 col-lg-4"></div>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body>
<form action="pupdateprofile" method="post" name="s" onsubmit="return validate3();" class="form-group">
<table>
<c:forEach items="${data}" var="element"> 
<div class="col-xs-6 col-sm-6 col-md-4 col-lg-4">
<label>First Name</label><input type=text  name="first_name" class="form-control" placeholder="Enter First Name" value="${element.first_name}"><br>
<label>Last name</label><input type=text  name="last_name" class="form-control" placeholder="Enter Last Name" value="${element.last_name}"><br>
<label>Email</label><input type=email name=email readonly class="form-control" placeholder="Enter Email" value="${element.email}"><br>
<label>Password</label><input type=text name=password class="form-control" placeholder="Enter Password" value="${element.password}"><br>
</div>
<div class="col-xs-6 col-sm-6 col-md-4 col-lg-4">
<label>Gender</label>
<div>
<input type=radio name=gender value="Male" <c:choose><c:when test="${element.gender=='Male'}">checked</c:when> <c:otherwise></c:otherwise></c:choose>>Male &nbsp
                     <input type=radio name=gender value="Female" <c:choose><c:when test="${element.gender=='Male'}"></c:when> <c:otherwise>checked</c:otherwise></c:choose>>Female <br>
</div>
<label>Phone number</label><input type=number name=phone class="form-control" placeholder="Enter Phone Number" value="${element.phone}"><br>
<label>Address</label><textarea name=address class="form-control" placeholder="Enter Address">${element.address}</textarea><br>
<label>Postal code</label><input type=number class="form-control" name="postal_code" placeholder="Enter Postal Code" value="${element.postal_code}"><br>
</div>
<div class="container">
<input type=submit value="Update" class="btn btn-default btn-block btn-primary"><br>
</div>
</c:forEach>
</table>
</form>
</body>
</html>