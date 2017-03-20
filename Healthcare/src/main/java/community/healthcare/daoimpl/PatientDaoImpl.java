package community.healthcare.daoimpl;

import java.util.List;

import community.healthcare.model.Nurse;
import community.healthcare.model.PatientRequest;
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
	public List<Nurse> aviewdoctor() {
		// TODO Auto-generated method stub
		return patientService.aviewdoctor();
	}
	public List<Nurse> prequest() {
		// TODO Auto-generated method stub
		return patientService.prequest();
	}
	public String prequestsubmit(PatientRequest prequest) {
		// TODO Auto-generated method stub
		return patientService.prequestsubmit(prequest);
	}
	public List<PatientRequest> pviewstatus(String pemail) {
		// TODO Auto-generated method stub
		return patientService.pviewstatus(pemail);
	}
	public String pcancelconform(int requestId, String note) {
		// TODO Auto-generated method stub
		return patientService.pcancelconform(requestId,note);
	}
	
	
}
