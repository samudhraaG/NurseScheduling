package community.healthcare.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import community.healthcare.boimpl.AgencyBoImpl;
import community.healthcare.boimpl.DoctorBoImpl;
import community.healthcare.model.Doctor;

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
}
