package community.healthcare.boimpl;

import java.util.List;

import community.healthcare.daoimpl.DoctorDaoImpl;
import community.healthcare.model.Doctor;

public class DoctorBoImpl {
 DoctorDaoImpl ddi=new DoctorDaoImpl();
	public List<Doctor> dprofile(String demail) {
		
		return ddi.dprofile(demail);
	}
	public String dupdateprofile(Doctor doctor, String demail) {
		return ddi.dupdateprofile(doctor,demail);
	}
	

	
	

}
