package community.healthcare.daoimpl;

import java.util.List;

import community.healthcare.model.Doctor;
import community.healthcare.model.PRequest;
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
	public List<PRequest> dviewstatus(String demail) {
		// TODO Auto-generated method stub
		return ds.dviewstatus(demail);
	}
	public String dcancelconform(int requestId, String note) {
		// TODO Auto-generated method stub
		return ds.dcancelconform(requestId,note);
	}
	public String aassinconform(int requestId, int doctorId, String note) {
		// TODO Auto-generated method stub
		return ds.aassinconform(requestId,doctorId,note);
	}
	public String dacceptconform(int requestId, int doctorId, String note) {
		// TODO Auto-generated method stub
		return ds.dacceptconform(requestId,doctorId,note);
	}

}
