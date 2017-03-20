package community.healthcare.daoimpl;

import java.util.List;

import community.healthcare.model.Doctor;
import community.healthcare.model.PRequest;
import community.healthcare.model.Patient;
import community.healthcare.service.PatientRepository;

public class PatientDaoImpl {
  PatientRepository patientService=new PatientRepository();
	public List<Patient> patientProfile(String pemail) {
		
		return patientService.patientProfile(pemail);
	}
	public String updatePatientProfile(Patient patient, String pemail) {
		// TODO Auto-generated method stub
		return patientService.pupdateprofile(patient,pemail);
	}
	public List<Doctor> aviewdoctor() {
		// TODO Auto-generated method stub
		return patientService.aviewdoctor();
	}
	public List<Doctor> prequest() {
		// TODO Auto-generated method stub
		return patientService.prequest();
	}
	public String prequestsubmit(PRequest prequest) {
		// TODO Auto-generated method stub
		return patientService.prequestsubmit(prequest);
	}
	public List<PRequest> pviewstatus(String pemail) {
		// TODO Auto-generated method stub
		return patientService.pviewstatus(pemail);
	}
	public String pcancelconform(int requestId, String note) {
		// TODO Auto-generated method stub
		return patientService.pcancelconform(requestId,note);
	}
	
	
}
