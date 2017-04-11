package community.healthcare.daoimpl;

import java.util.List;

import community.healthcare.model.Doctor;
import community.healthcare.model.PRequest;
import community.healthcare.model.Patient;
import community.healthcare.service.PatientService;

public class PatientDaoImpl {
  PatientService ps=new PatientService();
	public List<Patient> pprofile(String pemail) {
		
		return ps.pprofile(pemail);
	}
	public String pupdateprofile(Patient patient, String pemail) {
		// TODO Auto-generated method stub
		return ps.pupdateprofile(patient,pemail);
	}
	public List<Doctor> aviewdoctor() {
		// TODO Auto-generated method stub
		return ps.aviewdoctor();
	}
	public List<Doctor> prequest() {
		// TODO Auto-generated method stub
		return ps.prequest();
	}
	public String prequestsubmit(PRequest prequest) {
		// TODO Auto-generated method stub
		return ps.prequestsubmit(prequest);
	}
	public List<PRequest> pviewstatus(String pemail) {
		// TODO Auto-generated method stub
		return ps.pviewstatus(pemail);
	}
	public String pcancelconform(int requestId, String note) {
		// TODO Auto-generated method stub
		return ps.pcancelconform(requestId,note);
	}
	
	
}
