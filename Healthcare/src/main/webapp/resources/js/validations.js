function validate()
{
	var first_name=document.s.first_name.value;
	if(first_name=="")
		{
		alert("Please Enter Firstname");
		document.s.first_name.focus();
		return false;
		}
	var last_name=document.s.last_name.value;
	if(last_name=="")
		{
		alert("Please Enter Lastname");
		document.s.last_name.focus();
		return false;
		}
	var email=document.s.email.value;
	if(email=="")
		{
		alert("Please Enter Email Id");
		document.s.email.focus();
		return false;
		}
	
	var gender=document.s.gender.value;
	if(gender=="")
		{
		alert("Please Choose Gender");
		document.s.email.focus();
		return false;
		}
	
	var password=document.s.password.value;
	if(password=="")
		{
		alert("Please Enter Password");
		document.s.password.focus();
		return false;
		}
	var phone=document.s.phone.value;
	if(phone=="")
		{
		alert("Please Enter Phone Number");
		document.s.phone.focus();
		return false;
		} else if(phone.length!=10)
			{
			alert("Phone Number length should be 10");
			document.s.phone.focus();
			return false;
			}
	
	var postal_code=document.s.postal_code.value;
	if(postal_code=="")
		{
		alert("Please Enter Postal Code Number");
		document.s.postal_code.focus();
		return false;
		} else if(postal_code.length!=6)
			{
			alert("Postal Code Number length should be 6");
			document.s.postal_code.focus();
			return false;
			}
	
	var languages=document.s.languages.value;
	if(languages=="")
		{
		alert("Please Enter languages");
		document.s.languages.focus();
		return false;
		}
	
	var skills=document.s.skills.value;
	if(skills=="")
		{
		alert("Please Enter skills");
		document.s.skills.focus();
		return false;
		}
	
	var address=document.s.address.value;
	if(address=="")
		{
		alert("Please Enter address");
		document.s.address.focus();
		return false;
		}
	
		
	}
	
function validate3()
{
	var first_name=document.s.first_name.value;
	if(first_name=="")
		{
		alert("Please Enter Firstname");
		document.s.first_name.focus();
		return false;
		}
	var last_name=document.s.last_name.value;
	if(last_name=="")
		{
		alert("Please Enter Lastname");
		document.s.last_name.focus();
		return false;
		}
	var email=document.s.email.value;
	if(email=="")
		{
		alert("Please Enter Email Id");
		document.s.email.focus();
		return false;
		}
	var password=document.s.password.value;
	if(password=="")
		{
		alert("Please Enter Password");
		document.s.password.focus();
		return false;
		}
	
	var gender=document.s.gender.value;
	if(gender=="")
		{
		alert("Please Choose Gender");
		document.s.email.focus();
		return false;
		}
	
	
	var phone=document.s.phone.value;
	if(phone=="")
		{
		alert("Please Enter Phone Number");
		document.s.phone.focus();
		return false;
		} else if(phone.length!=10)
			{
			alert("Phone Number length should be 10");
			document.s.phone.focus();
			return false;
			}
	
	var address=document.s.address.value;
	if(address=="")
		{
		alert("Please Enter address");
		document.s.address.focus();
		return false;
		}
	var postal_code=document.s.postal_code.value;
	if(postal_code=="")
		{
		alert("Please Enter Postal Code Number");
		document.s.postal_code.focus();
		return false;
		} else if(postal_code.length!=6)
			{
			alert("Postal Code Number length should be 6");
			document.s.postal_code.focus();
			return false;
			}
	
	
	
	
	
		
	}
function validate2()
{
	var email=document.s.email.value;
	if(email=="")
		{
		alert("Please Enter Email Id");
		document.s.email.focus();
		return false;
		}
	
	var password=document.s.password.value;
	if(password=="")
		{
		alert("Please Enter Password");
		document.s.password.focus();
		return false;
		}
}

function validate4()
{
	var uname=document.s.uname.value;
	if(uname=="")
		{
		alert("Please Enter Username");
		document.s.uname.focus();
		return false;
		}
	
	var password=document.s.password.value;
	if(password=="")
		{
		alert("Please Enter Password");
		document.s.password.focus();
		return false;
		}
}

function validate5()
{
	var datee=document.s.datee.value;
	if(datee=="")
		{
		alert("Please Enter Date Id");
		document.s.datee.focus();
		return false;
		}
	
	var gender=document.s.gender.value;
	if(gender=="")
		{
		alert("Please Enter Gender");
		document.s.datee.focus();
		return false;
		}
	
	var doctorId=document.s.doctorId.value;
	if(doctorId=="")
		{
		alert("Please Enter Doctor Id");
		document.s.doctorId.focus();
		return false;
		}
	var timee=document.s.timee.value;
	if(timee=="")
		{
		alert("Please Enter Time");
		document.s.timee.focus();
		return false;
		}
	var requestType=document.s.requestType.value;
	if(requestType=="")
		{
		alert("Please Enter Request Type");
		document.s.requestType.focus();
		return false;
		}
	
	var serviceRequestType=document.s.serviceRequestType.value;
	if(serviceRequestType=="")
		{
		alert("Please Enter Service Request Type Type");
		document.s.serviceRequestType.focus();
		return false;
		}
	
	var location=document.s.location.value;
	if(location=="")
		{
		alert("Please Enter Location");
		document.s.location.focus();
		return false;
		}
	
	var language=document.s.language.value;
	if(language=="")
		{
		alert("Please Enter Language");
		document.s.language.focus();
		return false;
		}
	var description=document.s.description.value;
	if(description=="")
		{
		alert("Please Enter Description");
		document.s.description.focus();
		return false;
		}
}

