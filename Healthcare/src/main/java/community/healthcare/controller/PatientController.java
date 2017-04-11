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
import community.healthcare.boimpl.PatientBoImpl;
import community.healthcare.model.Doctor;
import community.healthcare.model.PRequest;
import community.healthcare.model.Patient;

@Controller
public class PatientController {

	 @RequestMapping(value="/pprofile")
		public ModelAndView pprofile(HttpServletRequest request)
		{
		   String pemail=(String)request.getSession().getAttribute("pemail");
			PatientBoImpl dbi=new PatientBoImpl();
			List<Patient> data=dbi.pprofile(pemail);
			ModelAndView mv=new ModelAndView("pprofile");
			mv.addObject("data",data);
			return mv;
		}
	 @RequestMapping(value="/pupdateprofile",method=RequestMethod.POST)
	   public ModelAndView preg(@ModelAttribute("patient") Patient patient,HttpServletRequest request)
	   { 
		   String pemail=(String)request.getSession().getAttribute("pemail");
	   	PatientBoImpl hb=new PatientBoImpl();
	   	String msg=hb.pupdateprofile(patient,pemail);
	   	
	   	ModelAndView mv=new ModelAndView("pmessage");
	   	mv.addObject("msg",msg);
	   	return mv;
	   }
	 
	 @RequestMapping(value="/pviewdoctor")
		public ModelAndView aviewdoctor()
		{
		 PatientBoImpl abi=new PatientBoImpl();
			List<Doctor> data=abi.aviewdoctor();
			ModelAndView mv=new ModelAndView("pviewdoctor");
			mv.addObject("data",data);
			return mv;
		}
	 @RequestMapping(value="/prequest")
		public ModelAndView prequest()
		{
		 PatientBoImpl abi=new PatientBoImpl();
			List<Doctor> data=abi.prequest();
			ModelAndView mv=new ModelAndView("prequest");
			mv.addObject("data",data);
			return mv;
		}
	
	 @RequestMapping(value="/prequestsubmit",method=RequestMethod.POST)
		public ModelAndView prequestsubmit(@ModelAttribute("prequest") PRequest prequest,HttpServletRequest request)
		{  
		 String pemail=(String)request.getSession().getAttribute("pemail");
		 prequest.setPatientEmail(pemail);
		 prequest.setStatus("Requested");
		    PatientBoImpl abi=new PatientBoImpl();
			String msg=abi.prequestsubmit(prequest);
			ModelAndView mv=new ModelAndView("pmessage");
		   	mv.addObject("msg",msg);
		   	return mv;
		}
	 @RequestMapping(value="/pviewstatus")
		public ModelAndView pviewstatus(HttpServletRequest request)
		{
		 String pemail=(String)request.getSession().getAttribute("pemail");
		 PatientBoImpl abi=new PatientBoImpl();
			List<PRequest> data=abi.pviewstatus(pemail);
			ModelAndView mv=new ModelAndView("pviewstatus");
			mv.addObject("data",data);
			return mv;
		}
	 @RequestMapping(value="/pcancel/{requestId}")
	public ModelAndView pcancel(@PathVariable("requestId") int requestId)
	{
		 ModelAndView mv=new ModelAndView("pcancel");
			mv.addObject("requestId",requestId);
			return mv;
	}
	 @RequestMapping(value="/pcancelconform",method=RequestMethod.POST)
	 public ModelAndView pcancelconform(@RequestParam("requestId") int requestId,@RequestParam("note") String note)
	 {  System.out.println("inside");
		 PatientBoImpl abi=new PatientBoImpl();
		 System.out.println("inside 2");
		 String msg=abi.pcancelconform(requestId,note);
		 System.out.println("inside 3");
		 ModelAndView mv=new ModelAndView("pmessage");
			mv.addObject("msg",msg);
			return mv;
	 }
}
