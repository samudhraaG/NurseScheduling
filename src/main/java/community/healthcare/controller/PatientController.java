package community.healthcare.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import community.healthcare.boimpl.DoctorBoImpl;
import community.healthcare.boimpl.PatientBoImpl;
import community.healthcare.model.Doctor;
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
	   	
	   	ModelAndView mv=new ModelAndView("message");
	   	mv.addObject("msg",msg);
	   	return mv;
	   }
}
