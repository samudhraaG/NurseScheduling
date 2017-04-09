<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="pupdateprofile" method="post">
<table>
<c:forEach items="${data}" var="element"> 
<tr><td><label>First Name</label></td><td><input type=text  name="first_name" placeholder="Enter First Name" value="${element.first_name}"></td></tr>
<tr><td><label>Last name</label></td><td><input type=text  name="last_name" placeholder="Enter Last Name" value="${element.last_name}"></td></tr>
<tr><td><label>Email</label></td><td><input type=email name=email readonly placeholder="Enter Email" value="${element.email}"></td></tr>
<tr><td><label>Password</label></td><td><input type=text name=password placeholder="Enter Password" value="${element.password}"></td></tr>
<tr><td><label>Gender</label></td><td><input type=radio name=gender value="Male" <c:choose><c:when test="${element.gender=='Male'}">checked</c:when> <c:otherwise></c:otherwise></c:choose>>Male &nbsp
                     <input type=radio name=gender value="Female" <c:choose><c:when test="${element.gender=='Male'}"></c:when> <c:otherwise>checked</c:otherwise></c:choose>>Female </td></tr>
<tr><td><label>Phone number</label></td><td><input type=number name=phone placeholder="Enter Phone Number" value="${element.phone}"></td></tr>
<tr><td><label>Address</label></td><td><textarea name=address placeholder="Enter Address">${element.address}</textarea></td></tr>
<tr><td><label>Postal code</label></td><td><input type=number name="postal_code" placeholder="Enter Postal Code" value="${element.postal_code}"></td></tr>
<tr><td></td><td><input type=submit value="Update"></td></tr>
</c:forEach>
</table>
</form>
</body>
</html>