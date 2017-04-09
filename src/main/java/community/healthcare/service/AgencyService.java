package community.healthcare.service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import community.healthcare.model.Doctor;

public class AgencyService {
	SessionFactory sessionfactory=new Configuration().configure().buildSessionFactory();
	Session session=sessionfactory.openSession();
	public List<Doctor> aviewdoctor() {
		session.beginTransaction();
			Query query=session.createQuery("from Doctor");
			List<Doctor> data=(List<Doctor>)query.list();
			
			return data;
	
	}

}
