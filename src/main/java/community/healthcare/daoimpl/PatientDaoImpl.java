package community.healthcare.daoimpl;

import java.util.List;

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

}
