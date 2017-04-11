package community.healthcare.boimpl;

import java.util.List;

import community.healthcare.daoimpl.PatientDaoImpl;
import community.healthcare.model.Doctor;
import community.healthcare.model.PRequest;
import community.healthcare.model.Patient;

public class PatientBoImpl {
     PatientDaoImpl pdi=new PatientDaoImpl();
	public List<Patient> pprofile(String pemail) {
		
		return pdi.pprofile(pemail);
	}
	public String pupdateprofile(Patient patient, String pemail) {
		
		return pdi.pupdateprofile(patient,pemail);
	}
	public List<Doctor> aviewdoctor() {
		// TODO Auto-generated method stub
		 return pdi.aviewdoctor();
	}
	public List<Doctor> prequest() {
		// TODO Auto-generated method stub
		return pdi.prequest();
	}
	public String prequestsubmit(PRequest prequest) {
		// TODO Auto-generated method stub
		return pdi.prequestsubmit(prequest);
	}
	public List<PRequest> pviewstatus(String pemail) {
		// TODO Auto-generated method stub
		return pdi.pviewstatus(pemail);
	}
	
	public String pcancelconform(int requestId,String note)
	{
		return pdi.pcancelconform(requestId,note);
		
	}
	
}
