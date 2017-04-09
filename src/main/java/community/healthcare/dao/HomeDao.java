package community.healthcare.dao;

import community.healthcare.model.Doctor;
import community.healthcare.model.Patient;

public interface HomeDao {
	public String hreg(Doctor doctor);
	public String preg(Patient patient);
}
