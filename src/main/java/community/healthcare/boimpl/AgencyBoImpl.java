package community.healthcare.boimpl;

import java.util.List;

import community.healthcare.daoimpl.AgencyDaoImpl;
import community.healthcare.model.Doctor;



public class AgencyBoImpl {
	AgencyDaoImpl abi=new AgencyDaoImpl();
	public List<Doctor> aviewdoctor() {
		// TODO Auto-generated method stub
		return abi.aviewdoctor();
	}

}
