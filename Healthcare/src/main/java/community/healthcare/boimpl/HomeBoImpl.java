package community.healthcare.boimpl;




import community.healthcare.daoimpl.HomeDaoImpl;
import community.healthcare.model.Doctor;
import community.healthcare.model.Patient;

public class HomeBoImpl {
	HomeDaoImpl hdm=new HomeDaoImpl();
	public String hreg(Doctor doctor) {
		
		return hdm.hreg(doctor);
	}
	public String preg(Patient patient) {
		
	return hdm.preg(patient);
}
	public boolean hlog(Doctor doctor) {
		
		return hdm.hlog(doctor);
	}
	public boolean plog(Patient patient) {
		// TODO Auto-generated method stub
		return hdm.plog(patient);
	}

}
