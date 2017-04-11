package community.healthcare.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import community.healthcare.boimpl.AgencyBoImpl;
import community.healthcare.boimpl.DoctorBoImpl;
import community.healthcare.boimpl.PatientBoImpl;
import community.healthcare.model.Doctor;
import community.healthcare.model.PRequest;
import community.healthcare.model.Patient;

@Controller
public class AgencyController {

	 @RequestMapping(value="/aviewdoctor")
		public ModelAndView aviewdoctor()
		{
	       AgencyBoImpl abi=new AgencyBoImpl();
			List<Doctor> data=abi.aviewdoctor();
			ModelAndView mv=new ModelAndView("aviewdoctor");
			mv.addObject("data",data);
			return mv;
		}
	 
	   @RequestMapping(value="/aviewpatient")
		public ModelAndView aviewpatient()
		{
	       AgencyBoImpl abi=new AgencyBoImpl();
			List<Patient> data=abi.aviewpatient();
			System.out.println(data.size());
			ModelAndView mv=new ModelAndView("aviewpatient");
			mv.addObject("data",data);
			return mv;
		}
	   
	   @RequestMapping(value="/aviewstatus")
		public ModelAndView aviewstatus()
		{
		
		   AgencyBoImpl abi=new AgencyBoImpl();
			List<PRequest> data=abi.aviewstatus();
			ModelAndView mv=new ModelAndView("aviewstatus");
			mv.addObject("data",data);
			return mv;
		}
	   @RequestMapping(value="/acancel/{requestId}")
		public ModelAndView acancel(@PathVariable("requestId") int requestId)
		{
			 ModelAndView mv=new ModelAndView("acancel");
				mv.addObject("requestId",requestId);
				return mv;
		}
	   @RequestMapping(value="/acancelconform",method=RequestMethod.POST)
		 public ModelAndView acancelconform(@RequestParam("requestId") int requestId,@RequestParam("note") String note)
		 {  
			 AgencyBoImpl abi=new AgencyBoImpl();
			 String msg=abi.acancelconform(requestId,note);
			 ModelAndView mv=new ModelAndView("amessage");
				mv.addObject("msg",msg);
				return mv;
		 }
	   @RequestMapping(value="/aassign/{requestId}/{doctorId}")
	   public ModelAndView aassign(@PathVariable("requestId") int requestId,@PathVariable("doctorId") int doctorId)
	   {  

		   AgencyBoImpl abi=new AgencyBoImpl();
			List<Doctor> data=abi.aviewdoctor();
			ModelAndView mv=new ModelAndView("aassign");
			mv.addObject("data",data);
			mv.addObject("requestId",requestId);
			mv.addObject("doctorId",doctorId);
		   return mv;
	   }
	   @RequestMapping(value="/aassinconform",method=RequestMethod.POST)
	   public ModelAndView aassinconform(@RequestParam("requestId") int requestId,@RequestParam("doctorId") int doctorId,@RequestParam("note") String note)
	   {
		     AgencyBoImpl abi=new AgencyBoImpl();
			 String msg=abi.aassinconform(requestId,doctorId,note);
			 ModelAndView mv=new ModelAndView("amessage");
				mv.addObject("msg",msg);
				return mv;
		   
	   }
	   @RequestMapping(value="/viewdoctor/{doctorId}")
	   public ModelAndView viewdoctor(@PathVariable("doctorId") int doctorId)
	   { 
		   AgencyBoImpl abi=new AgencyBoImpl();
		   List<Doctor> data=abi.viewdoctor(doctorId);
			ModelAndView mv=new ModelAndView("viewdoctor");
			mv.addObject("data",data);
			return mv;
	   }
}
