package community.healthcare.boimpl;

import java.util.List;

import community.healthcare.daoimpl.DoctorDaoImpl;
import community.healthcare.model.Doctor;
import community.healthcare.model.PRequest;

public class DoctorBoImpl {
 DoctorDaoImpl ddi=new DoctorDaoImpl();
	public List<Doctor> dprofile(String demail) {
		
		return ddi.dprofile(demail);
	}
	public String dupdateprofile(Doctor doctor, String demail) {
		return ddi.dupdateprofile(doctor,demail);
	}
	public List<PRequest> dviewstatus(String demail) {
		// TODO Auto-generated method stub
		return ddi.dviewstatus(demail);
	}
	public String dcancelconform(int requestId, String note) {
		// TODO Auto-generated method stub
		return ddi.dcancelconform(requestId,note);
	}
	public String aassinconform(int requestId, int doctorId, String note) {
		// TODO Auto-generated method stub
		return ddi.aassinconform(requestId,doctorId,note);
	}
	public String dacceptconform(int requestId, int doctorId, String note) {
		// TODO Auto-generated method stub
		return ddi.dacceptconform(requestId,doctorId,note);
	}
	

	
	

}
