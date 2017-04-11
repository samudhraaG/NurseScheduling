<%@ include file="back4.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body>
<form action="prequestsubmit" method="post" name="s" onsubmit="return validate5();" class="form-group">
<div class="container"><center><h2>SEND REQUEST</h2></center></div>
<div class="col-lg-3"></div>
<div class="col-lg-3">
<label>Date Preference</label><input type=date class="form-control" id="datee" name=datee  placeholder="Choose Date"  ><span id="day"></span><br>
<label>Time Preference</label><input type=time class="form-control" id="timee" name=timee  placeholder="Choose Time" ><span id="time"></span><br>
<label>Type of Request</label><input type=text class="form-control" name=requestType  placeholder="Enter type of Request" ><br>
<label>Type of Service Requested</label><input type=text class="form-control" name=serviceRequestType  placeholder="Enter Type of Service Requested" ><br>
<label>Location Preference</label><input type=text name=location class="form-control" placeholder="Enter Location Preference" ><br>
</div>
<div class="col-lg-3">
<label>Gender Preference</label><br>
<div>
<input type=radio name=gender id="gender" value="Male" onchange="dayofweek()">Male<input type=radio id="gender" name=gender value="Female" onchange="dayofweek()">Female<br>
</div><br>

<label>Care Giver Preference</label><select name="doctorId" id="doctor" class="form-control" onchange="selectfun()">
                                                    
                                                     </select><br>
<label>Language Preference</label><input type=text  name=language id="language" class="form-control" placeholder="Enter Language Preference" ><br>
<label>Description</label><textarea name="description" class="form-control" placeholder="Write Description for your Request"></textarea><br>

<input type=submit value="Send Request" class="btn btn-default btn-block btn-primary"><br>
</div><div class="col-lg-3"></div>
</form>
</body>
<script>   

var d2=new Date();
var dd=d2.getDate();
var mm=d2.getMonth();
var yy=d2.getFullYear();
var d3=yy+"-"+(mm+1)+"-"+dd;
document.getElementById('datee').setAttribute("min",d3);

function reset()
{      alert();
	document.getElementById('gender').checked = false;
	document.getElementById('day').innerHTML ="";
	document.getElementById('time').innerHTML ="";
	document.getElementById('language').setAttribute("value", "");
	document.getElementById('doctor').innerHTML="";
}
function dayofweek()
{  
	var datee=document.getElementById('datee').value;
	var gender="";
	if (document.getElementById('gender').checked) {
		gender = document.getElementById('gender').value;
		}
	var d = new Date(datee);
    var n = d.getDay();
    if(n==0)
   {   
    	document.getElementById('day').innerHTML="SUNDAY";
    	var options="<option>Select Care Giver</option>";
    	<c:forEach items="${data}" var="element"> 
    	
    	if('${element.sunday}'=="on" && '${element.gender}'==gender)
        {
    	options=options+"<option value='${element.doctorId}'>${element.first_name} &nbsp ${element.last_name}</option>";
        }
    	</c:forEach>
    	document.getElementById('doctor').innerHTML=options;
    	
   }else if(n==1)
   {
	   document.getElementById('day').innerHTML="MONDAY";
	   var options="<option>Select Care Giver</option>";
          	<c:forEach items="${data}" var="element"> 
   	
       	if('${element.monday}'=="on" && '${element.gender}'==gender)
       {
   	      options=options+"<option value='${element.doctorId}'>${element.first_name} &nbsp ${element.last_name}</option>";
       }
       	</c:forEach>
     	document.getElementById('doctor').innerHTML=options;
   }
   else if(n==2)
   {
	   document.getElementById('day').innerHTML="TUESDAY";
	   var options="<option>Select Care Giver</option>";
   	<c:forEach items="${data}" var="element"> 
   	
   	if('${element.tuesday}'=="on" && '${element.gender}'==gender)
       {
   	options=options+"<option value='${element.doctorId}'>${element.first_name} &nbsp ${element.last_name}</option>";
       }
   	</c:forEach>
   	document.getElementById('doctor').innerHTML=options;
   }
   else if(n==3)
   {
	   document.getElementById('day').innerHTML="WEDNESDAY";
	   var options="<option>Select Care Giver</option>";
     	<c:forEach items="${data}" var="element"> 
	
  	if('${element.wednesday}'=="on" && '${element.gender}'==gender)
  {
	      options=options+"<option value='${element.doctorId}'>${element.first_name} &nbsp ${element.last_name}</option>";
  }
  	</c:forEach>
	document.getElementById('doctor').innerHTML=options;
	   
   }
   else if(n==4)
   {
	   document.getElementById('day').innerHTML="THURSDAY";
	   var options="<option>Select Care Giver</option>";
     	<c:forEach items="${data}" var="element"> 
	
  	if('${element.thursday}'=="on" && '${element.gender}'==gender)
  {
	      options=options+"<option value='${element.doctorId}'>${element.first_name} &nbsp ${element.last_name}</option>";
  }
  	</c:forEach>
	document.getElementById('doctor').innerHTML=options;
   }
   else if(n==5)
   {
	   document.getElementById('day').innerHTML="FRIDAY";
	   var options="<option>Select Care Giver</option>";
     	<c:forEach items="${data}" var="element"> 
	
  	if('${element.friday}'=="on" && '${element.gender}'==gender)
  {
	      options=options+"<option value='${element.doctorId}'>${element.first_name} &nbsp ${element.last_name}</option>";
  }
  	</c:forEach>
	document.getElementById('doctor').innerHTML=options;
   }
   else if(n==6)
   {
	   document.getElementById('day').innerHTML="SATURDAY";
	   var options="<option>Select Care Giver</option>";
     	<c:forEach items="${data}" var="element"> 
	
  	if('${element.saturday}'=="on" && '${element.gender}'==gender)
  {
	      options=options+"<option value='${element.doctorId}'>${element.first_name} &nbsp ${element.last_name}</option>";
  }
  	</c:forEach>
	document.getElementById('doctor').innerHTML=options;
   }
    
    
}

function selectfun()
{ 
	var selected=document.getElementById('doctor').value;
	<c:forEach items="${data}" var="element"> 
	if('${element.doctorId}'==selected)
	{
		document.getElementById('language').setAttribute("value", '${element.languages}');
		
		var datee=document.getElementById('datee').value;
		var d = new Date(datee);
	    var n = d.getDay();
	    if(n==0)
	   {   
	    	document.getElementById('time').innerHTML='Available Timings  '+'${element.sunday_time}';
	    	
	   }else if(n==1)
	   {
		   document.getElementById('time').innerHTML='Available Timings  '+'${element.monday_time}';
	   }
	   else if(n==2)
	   {
		   document.getElementById('time').innerHTML='Available Timings  '+'${element.tuesday_time}';
	   }
	   else if(n==3)
	   {
		   document.getElementById('time').innerHTML='Available Timings  '+'${element.wednesday_time}';
	   }
	   else if(n==4)
	   {
		   document.getElementById('time').innerHTML='Available Timings  '+'${element.thursday_time}';
	   }
	   else if(n==5)
	   {
		   document.getElementById('time').innerHTML='Available Timings  '+'${element.friday_time}';
	   }
	   else if(n==6)
	   {
		   document.getElementById('time').innerHTML='Available Timings  '+'${element.saturday_time}';
	   }
	}
	</c:forEach>
}
</script>

</html>