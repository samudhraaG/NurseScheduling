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
<form action="dupdateprofile" method="post">
<table>
<c:forEach items="${data}" var="element"> 
 <tr><td><label>First Name</label></td><td><input type=text name="first_name" placeholder="Enter First Name" value="${element.first_name}"></td></tr>
<tr><td><label>Last name</label></td><td><input type=text name="last_name" placeholder="Enter Last Name" value="${element.last_name}"></td></tr>
<tr><td><label>Email</label></td><td><input type=email readonly name=email placeholder="Enter Email" value="${element.email}"></td></tr>
<tr><td><label>Password</label></td><td><input type=text name=password placeholder="Enter Password" value="${element.password}"></td></tr>
<tr><td><label>Gender</label></td><td>

                     <input type=radio name=gender  value="Male"   <c:choose><c:when test="${element.gender=='Male'}">checked</c:when> <c:otherwise></c:otherwise></c:choose>>Male &nbsp
                     <input type=radio name=gender value="Female"  <c:choose><c:when test="${element.gender=='Male'}"></c:when> <c:otherwise>checked</c:otherwise></c:choose> >Female </td></tr>
<tr><td><label>Phone number</label></td><td><input type=number name=phone placeholder="Enter Phone Number" value="${element.phone}"></td></tr>
<tr><td><label>Address</label></td><td><textarea name=address placeholder="Enter Address">${element.address}</textarea></td></tr>
<tr><td><label>Postal code</label></td><td><input type=number name="postal_code" placeholder="Enter Postal Code" value="${element.postal_code}"></td></tr>
<tr><td><label>Languages known</label></td><td><input type=text name="languages" placeholder="Enter Languages known" value="${element.languages}"></td></tr>
<tr><td><label>Skill Set</label></td><td><input type=text name="skills" placeholder="Skill Set" value="${element.skills}"></td></tr>
<tr><td><label>Availability through week</label></td><td>
                          <input type=checkbox name=sunday id="sunday"  <c:choose><c:when test="${element.sunday=='on'}">checked</c:when> <c:otherwise></c:otherwise></c:choose>>Sunday &nbsp &nbsp &nbsp 
                          <input type=checkbox name=monday id="monday"  <c:choose><c:when test="${element.monday=='on'}">checked</c:when> <c:otherwise></c:otherwise></c:choose>>Monday &nbsp &nbsp 
                          <input type=checkbox name=tuesday id="tuesday"  <c:choose><c:when test="${element.tuesday=='on'}">checked</c:when> <c:otherwise></c:otherwise></c:choose>>Tuesday &nbsp 
                          <input type=checkbox name=wednesday id="wednesday" <c:choose><c:when test="${element.wednesday=='on'}">checked</c:when> <c:otherwise></c:otherwise></c:choose>>Wednesday  
                          <input type=checkbox name=thursday id="thursday"  <c:choose><c:when test="${element.thursday=='on'}">checked</c:when> <c:otherwise></c:otherwise></c:choose>>Thursday &nbsp &nbsp  
                          <input type=checkbox name=friday id="friday"  <c:choose><c:when test="${element.friday=='on'}">checked</c:when> <c:otherwise></c:otherwise></c:choose>>Friday &nbsp &nbsp &nbsp 
                          <input type=checkbox name=saturday id="saturday" <c:choose><c:when test="${element.saturday=='on'}">checked</c:when> <c:otherwise></c:otherwise></c:choose>>Saturday  </td></tr>

<tr><td><label>Timings</label></td><td> <textarea name=sunday_time placeholder="Available Time On Sunday" rows=3 cols=10 >${element.sunday_time}</textarea>
                                        <textarea name=monday_time placeholder="Available Time On Monday" rows=3 cols=10 >${element.monday_time}</textarea>
                                        <textarea name=tuesday_time placeholder="Available Time On Tuesday" rows=3 cols=10 >${element.tuesday_time}</textarea>
                                        <textarea name=wednesday_time placeholder="Available Time On wednesday" rows=3 cols=10 >${element.wednesday_time}</textarea>
                                        <textarea name=thursday_time placeholder="Available Time On Thursday" rows=3 cols=10 >${element.thursday_time}</textarea>
                                        <textarea name=friday_time placeholder="Available Time On Friday" rows=3 cols=10 >${element.friday_time}</textarea>
                                        <textarea name=saturday_time placeholder="Available Time On Saturday" rows=3 cols=10 >${element.saturday_time}</textarea>
<tr><td></td><td><input type=submit value="Update"></td></tr>
</c:forEach>
</table>
</form>

</body>
</html>