package community.healthcare.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import community.healthcare.boimpl.DoctorBoImpl;
import community.healthcare.boimpl.HomeBoImpl;
import community.healthcare.model.Doctor;

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
   	
   	ModelAndView mv=new ModelAndView("message");
   	mv.addObject("msg",msg);
   	return mv;
   }
}
