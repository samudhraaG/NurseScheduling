import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import community.healthcare.model.Doctor;
import community.healthcare.model.PRequest;
import community.healthcare.model.Patient;


public class DBCreater {
public static void main(String args[])
{    Doctor doctor=new Doctor();
     Patient patient=new Patient();
     PRequest prequest=new PRequest();
	 SessionFactory sessionfactory=new Configuration().configure().buildSessionFactory();
	 Session session=sessionfactory.openSession();
	session.beginTransaction();
	session.save(doctor);
	session.save(patient);
	session.save(prequest);
	session.getTransaction().commit();
	session.close();
	sessionfactory.close();
}
}
