package community.healthcare.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import community.healthcare.boimpl.HomeBoImpl;
import community.healthcare.model.Doctor;
import community.healthcare.model.Patient;
@Controller
public class MainController {
	
@RequestMapping(value="/hreg",method=RequestMethod.POST)
public ModelAndView preg(@ModelAttribute("doctor") Doctor doctor)
{ 
	
	HomeBoImpl hb=new HomeBoImpl();
	String msg=hb.hreg(doctor);
	
	ModelAndView mv=new ModelAndView("message");
	mv.addObject("msg",msg);
	return mv;
}

@RequestMapping(value="/preg",method=RequestMethod.POST)
public ModelAndView preg(@ModelAttribute("patient") Patient patient)
{ 
	
	HomeBoImpl hb=new HomeBoImpl();
	String msg=hb.preg(patient);
	ModelAndView mv=new ModelAndView("message");
	mv.addObject("msg",msg);
	return mv;
}

@RequestMapping(value="/hlog",method=RequestMethod.POST)
public ModelAndView hlog(@ModelAttribute("doctor") Doctor doctor,HttpServletRequest request)
{   
	String msg=null;boolean status=false;
	HomeBoImpl hb=new HomeBoImpl();
	status=hb.hlog(doctor);
    ModelAndView mv=null;
	if(status)
	{ 
		mv=new ModelAndView("doctor");	   	     
	     msg="Login success";
	     request.getSession().setAttribute("demail", doctor.getEmail());
		 mv.addObject("msg",msg);
		 mv.addObject("demail",doctor.getEmail().toUpperCase());
		
	}else{
		 mv=new ModelAndView("message");
		 msg="Login Fails";
		 mv.addObject("msg",msg);
	}
   
	return mv;
}

@RequestMapping(value="/plog",method=RequestMethod.POST)
public ModelAndView hlog(@ModelAttribute("patient") Patient patient,HttpServletRequest request)
{ 
	String msg=null;boolean status=false;
	HomeBoImpl hb=new HomeBoImpl();
	status=hb.plog(patient);
    ModelAndView mv=null;
	if(status)
	{ 
		mv=new ModelAndView("patient");	   
		
		 
	     msg="Login success";
	     request.getSession().setAttribute("pemail", patient.getEmail());
	     mv.addObject("pemail",patient.getEmail().toUpperCase());
	}else{
		 mv=new ModelAndView("message");
		 msg="Login Fails";
		 mv.addObject("msg",msg);
		
	}
   
	return mv;
}


@RequestMapping(value="/alog",method=RequestMethod.POST)
public ModelAndView preg(@RequestParam("uname") String uname,@RequestParam("password") String password)
{     ModelAndView mv=null;String msg=null;
	if(uname.equals("admin") && password.equals("admin"))
	{
		mv=new ModelAndView("agency");	   	     
	     msg="Login success";
		 mv.addObject("msg",msg);
	}else
	{
		mv=new ModelAndView("message");
		 msg="Login Fails";
		 mv.addObject("msg",msg);
	}
	
	return mv;
}

}
