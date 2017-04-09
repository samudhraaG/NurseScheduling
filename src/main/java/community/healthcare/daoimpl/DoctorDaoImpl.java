package community.healthcare.daoimpl;

import java.util.List;

import community.healthcare.model.Doctor;
import community.healthcare.service.DoctorService;

public class DoctorDaoImpl {
	DoctorService ds=new DoctorService();
	public List<Doctor> dprofile(String demail) {
		
		return ds.dprofile(demail);
	}
	public String dupdateprofile(Doctor doctor, String demail) {
		// TODO Auto-generated method stub
		return ds.dupdateprofile(doctor,demail);
	}

}
