package community.healthcare.boimpl;

import java.util.List;

import community.healthcare.daoimpl.PatientDaoImpl;
import community.healthcare.model.Nurse;
import community.healthcare.model.PatientRequest;
import community.healthcare.model.Patient;

public class PatientBoImpl {
     PatientDaoImpl patientDAO=new PatientDaoImpl();
	public List<Patient> patientProfile(String pemail) {
		
		return patientDAO.patientProfile(pemail);
	}
	public String pupdateprofile(Patient patient, String pemail) {
		
		return patientDAO.updatePatientProfile(patient,pemail);
	}
	public List<Nurse> aviewdoctor() {
		// TODO Auto-generated method stub
		 return patientDAO.aviewdoctor();
	}
	public List<Nurse> prequest() {
		// TODO Auto-generated method stub
		return patientDAO.prequest();
	}
	public String prequestsubmit(PatientRequest prequest) {
		// TODO Auto-generated method stub
		return patientDAO.prequestsubmit(prequest);
	}
	public List<PatientRequest> pviewstatus(String pemail) {
		// TODO Auto-generated method stub
		return patientDAO.pviewstatus(pemail);
	}
	
	public String pcancelconform(int requestId,String note)
	{
		return patientDAO.pcancelconform(requestId,note);
		
	}
	
}
