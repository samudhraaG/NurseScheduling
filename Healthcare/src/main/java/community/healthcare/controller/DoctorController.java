package community.healthcare.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import community.healthcare.boimpl.AgencyBoImpl;
import community.healthcare.boimpl.DoctorBoImpl;
import community.healthcare.boimpl.HomeBoImpl;
import community.healthcare.boimpl.PatientBoImpl;
import community.healthcare.model.Doctor;
import community.healthcare.model.PRequest;

@Controller
public class DoctorController {
	
   @RequestMapping(value="/dprofile")
	public ModelAndView dprofile(HttpServletRequest request)
	{
	   String demail=(String)request.getSession().getAttribute("demail");
		DoctorBoImpl dbi=new DoctorBoImpl();
		List<Doctor> data=dbi.dprofile(demail);
		ModelAndView mv=new ModelAndView("dprofile");
		mv.addObject("data",data);
		return mv;
	}
   
   @RequestMapping(value="/dupdateprofile",method=RequestMethod.POST)
   public ModelAndView preg(@ModelAttribute("doctor") Doctor doctor,HttpServletRequest request)
   { 
	   String demail=(String)request.getSession().getAttribute("demail");
   	DoctorBoImpl hb=new DoctorBoImpl();
   	String msg=hb.dupdateprofile(doctor,demail);
   	
   	ModelAndView mv=new ModelAndView("dmessage");
   	mv.addObject("msg",msg);
   	return mv;
   }
   
   @RequestMapping(value="/dviewstatus")
	public ModelAndView dviewstatus(HttpServletRequest request)
	{
	 String demail=(String)request.getSession().getAttribute("demail");
	 DoctorBoImpl abi=new DoctorBoImpl();
		List<PRequest> data=abi.dviewstatus(demail);
		ModelAndView mv=new ModelAndView("dviewstatus");
		mv.addObject("data",data);
		return mv;
	}
   
   @RequestMapping(value="/dcancel/{requestId}")
  	public ModelAndView pcancel(@PathVariable("requestId") int requestId)
  	{
  		 ModelAndView mv=new ModelAndView("dcancel");
  			mv.addObject("requestId",requestId);
  			return mv;
  	}
   @RequestMapping(value="/dcancelconform",method=RequestMethod.POST)
	 public ModelAndView dcancelconform(@RequestParam("requestId") int requestId,@RequestParam("note") String note)
	 { 
		 DoctorBoImpl abi=new DoctorBoImpl();
		
		 String msg=abi.dcancelconform(requestId,note);
		
		 ModelAndView mv=new ModelAndView("dmessage");
			mv.addObject("msg",msg);
			return mv;
	 }
   
   @RequestMapping(value="/dassign/{requestId}/{doctorId}")
   public ModelAndView dassign(@PathVariable("requestId") int requestId,@PathVariable("doctorId") int doctorId)
   {  

	 
		ModelAndView mv=new ModelAndView("dassign");
		mv.addObject("requestId",requestId);
		mv.addObject("doctorId",doctorId);
	   return mv;
   }
   @RequestMapping(value="/dassinconform",method=RequestMethod.POST)
   public ModelAndView dassinconform(@RequestParam("requestId") int requestId,@RequestParam("doctorId") int doctorId,@RequestParam("note") String note)
   {
	   DoctorBoImpl dbi=new DoctorBoImpl();
		 String msg=dbi.aassinconform(requestId,doctorId,note);
		 ModelAndView mv=new ModelAndView("dmessage");
			mv.addObject("msg",msg);
			return mv;
	   
   }
   @RequestMapping(value="/daccept/{requestId}/{doctorId}")
   public ModelAndView daccept(@PathVariable("requestId") int requestId,@PathVariable("doctorId") int doctorId)
   {
	   ModelAndView mv=new ModelAndView("daccept");
		mv.addObject("requestId",requestId);
		mv.addObject("doctorId",doctorId);
	   return mv;
   }
   @RequestMapping(value="/dacceptconform",method=RequestMethod.POST)
   public ModelAndView dacceptconform(@RequestParam("requestId") int requestId,@RequestParam("doctorId") int doctorId,@RequestParam("note") String note)
   {
	   DoctorBoImpl dbi=new DoctorBoImpl();
		 String msg=dbi.dacceptconform(requestId,doctorId,note);
		 ModelAndView mv=new ModelAndView("dmessage");
			mv.addObject("msg",msg);
			return mv;
   }
}
