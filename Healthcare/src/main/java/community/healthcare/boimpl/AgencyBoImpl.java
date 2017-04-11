package community.healthcare.boimpl;

import java.util.List;

import community.healthcare.daoimpl.AgencyDaoImpl;
import community.healthcare.model.Doctor;
import community.healthcare.model.PRequest;
import community.healthcare.model.Patient;



public class AgencyBoImpl {
	AgencyDaoImpl abi=new AgencyDaoImpl();
	public List<Doctor> aviewdoctor() {
		// TODO Auto-generated method stub
		return abi.aviewdoctor();
	}
	public List<Patient> aviewpatient() {
		// TODO Auto-generated method stub
		return abi.aviewpatient();
	}
	public List<PRequest> aviewstatus() {
		// TODO Auto-generated method stub
		return abi.aviewstatus();
	}
	public String acancelconform(int requestId, String note) {
		// TODO Auto-generated method stub
		return abi.acancelconform(requestId,note);
	}
	public String aassinconform(int requestId, int doctorId,String note) {
		// TODO Auto-generated method stub
		return abi.aassinconform(requestId,doctorId,note);
	}
	public List<Doctor> viewdoctor(int doctorId) {
		// TODO Auto-generated method stub
		return abi.viewdoctor(doctorId);
	}

}
