package community.healthcare.daoimpl;

import java.util.List;

import community.healthcare.model.Doctor;
import community.healthcare.service.AgencyService;

public class AgencyDaoImpl {
	AgencyService as=new AgencyService();
	public List<Doctor> aviewdoctor() {
		
		return as.aviewdoctor();
	}

}
