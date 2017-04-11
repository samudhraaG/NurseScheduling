<%@ include file="back4.jsp" %>
    <style type="text/css">
        .imgStyle
        {
            width:100px;
            height:100px;
            border:3px solid grey;
        }
		
		#pop
		{
		height:540px;
		width:540px;
		position:fixed;
		bottom:5%;
		right:10%;
		border:2px solid;
		padding:10px;
		background:#FFFFFF;
		border-radius:9px;
		visibility:hidden;
		}
		#close
		{
		right:5;
		top:5;
		float:right;
		}
    </style>
    
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

<tr><td>${element.first_name}</td><td>${element.last_name}</td><td>${element.email}</td><td>${element.gender}</td><td>${element.phone}</td><td>${element.address}</td><td>${element.postal_code}</td><td>${element.languages}</td><td>${element.skills}</td><td><a href="viewdoctor/${element.doctorId}" target="_new"><input type=button value=Timings></a></td></tr>
</c:forEach>
</table>
</div>
<div id="pop">
  <button id="close" onclick="document.getElementById('pop').style.visibility='hidden'">X</button><br>
 
<center>
<H2>AVAILABLE TIMINGS</H2>
<table>
<tr><td id="sunday" style="width:250px;height:50px;"></td><td id="sundayTime2"></td></tr>
<tr><td id="monday" style="width:250px;height:50px;"></td><td id="mondayTime2"></td></tr>
<tr><td id="tuesday" style="width:250px;height:50px;"></td><td id="tuesdayTime2"></td></tr>
<tr><td id="wednesday" style="width:250px;height:50px;"></td><td id="wednesdayTime2"></td></tr>
<tr><td id="thursday" style="width:250px;height:50px;"></td><td id="thursdayTime2"></td></tr>
<tr><td id="friday" style="width:250px;height:50px;"></td><td id="fridayTime2"></td></tr>
<tr><td id="saturday" style="width:250px;height:50px;"></td><td id="saturdayTime2"></td></tr>
</table>

</center>
		  </div>


<script type="text/javascript">
        
   function changeImageOnClick(event,sunday,monday,tuesday,wednesday,thursday,friday,saturday,sundayTime,mondayTime,tuesdayTime,wednesdayTime,thursdayTime,fridayTime,saturdayTime)
        {  
	     
            event = event || window.event;
            var targetElement = event.target || event.srcElement;
            
            if (targetElement.tagName == "INPUT")
            {
            	 var x = document.getElementById('pop');
				  x.style.visibility = 'visible';
				 if(sunday=='on') 
					 {
					 document.getElementById('sunday').innerHTML='SUNDAY';
					 document.getElementById('sundayTime2').innerHTML=sundayTime;
					 }
				 if(monday=='on') 
				 {
				 document.getElementById('monday').innerHTML='MONDAY';
				 document.getElementById('mondayTime2').innerHTML=mondayTime;
				 }
				 
				 if(tuesday=='on') 
				 {
				 document.getElementById('tuesday').innerHTML='TUESDAY';
				 document.getElementById('tuesdayTime2').innerHTML=tuesdayTime;
				 }
				 
				 if(wednesday=='on') 
				 {
				 document.getElementById('wednesday').innerHTML='WEDNESDAY';
				 document.getElementById('wednesdayTime2').innerHTML=wednesdayTime;
				 }
				 
				 if(thursday=='on') 
				 {
				 document.getElementById('thursday').innerHTML='THURSDAY';
				 document.getElementById('thursdayTime2').innerHTML=thursdayTime;
				 }
				 
				 if(friday=='on') 
				 {
				 document.getElementById('friday').innerHTML='FRIDAY';
				 document.getElementById('fridayTime2').innerHTML=fridayTime;
				 }
				 if(saturday=='on') 
				 {
				 document.getElementById('saturday').innerHTML='SATURDAY';
				 document.getElementById('saturdayTime2').innerHTML=saturdayTime;
				 }
				 
            }
            
        }
    </script>
</body>
</html>