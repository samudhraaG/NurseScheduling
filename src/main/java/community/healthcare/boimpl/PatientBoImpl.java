package community.healthcare.boimpl;

import java.util.List;

import community.healthcare.daoimpl.PatientDaoImpl;
import community.healthcare.model.Patient;

public class PatientBoImpl {
     PatientDaoImpl pdi=new PatientDaoImpl();
	public List<Patient> pprofile(String pemail) {
		
		return pdi.pprofile(pemail);
	}
	public String pupdateprofile(Patient patient, String pemail) {
		
		return pdi.pupdateprofile(patient,pemail);
	}

}
