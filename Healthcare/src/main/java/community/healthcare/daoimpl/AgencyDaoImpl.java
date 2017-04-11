package community.healthcare.daoimpl;

import java.util.List;

import community.healthcare.model.Doctor;
import community.healthcare.model.PRequest;
import community.healthcare.model.Patient;
import community.healthcare.service.AgencyService;

public class AgencyDaoImpl {
	AgencyService as=new AgencyService();
	public List<Doctor> aviewdoctor() {
		
		return as.aviewdoctor();
	}
	public List<Patient> aviewpatient() {
		// TODO Auto-generated method stub
		return as.aviewpatient();
	}
	public List<PRequest> aviewstatus() {
		// TODO Auto-generated method stub
		return as.aviewstatus();
	}
	public String acancelconform(int requestId, String note) {
		// TODO Auto-generated method stub
		return as.acancelconform(requestId,note);
	}
	public String aassinconform(int requestId, int doctorId,String note) {
		// TODO Auto-generated method stub
		return as.aassinconform(requestId,doctorId,note);
	}
	public List<Doctor> viewdoctor(int doctorId) {
		// TODO Auto-generated method stub
		return as.viewdoctor(doctorId);
	}

}
