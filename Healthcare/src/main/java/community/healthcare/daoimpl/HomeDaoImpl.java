package community.healthcare.daoimpl;



import community.healthcare.model.Doctor;
import community.healthcare.model.Patient;
import community.healthcare.service.HomeService;

public class HomeDaoImpl {
	HomeService hs=new HomeService();
	public String hreg(Doctor doctor) {
		
		return hs.hreg(doctor);
	}
	
public String preg(Patient patient) {
		
		
		return hs.preg(patient);
	}

public boolean hlog(Doctor doctor) {
	// TODO Auto-generated method stub
	return hs.hlog(doctor);
}

public boolean plog(Patient patient) {
	// TODO Auto-generated method stub
	return hs.plog(patient);
}


}
