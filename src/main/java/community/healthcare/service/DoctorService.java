package community.healthcare.service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import community.healthcare.model.Doctor;

public class DoctorService {

	SessionFactory sessionfactory=new Configuration().configure().buildSessionFactory();
	Session session=sessionfactory.openSession();
	public List<Doctor> dprofile(String demail) {
		session.beginTransaction();
		Query query=session.createQuery("from Doctor where email='"+demail+"'");
		List<Doctor> data=(List<Doctor>)query.list();
		return data;
	}
	public String dupdateprofile(Doctor doctor, String demail) {
		session.beginTransaction();
		String msg=null;
		try{
			Query query=session.createQuery("update Doctor set first_name='"+doctor.getFirst_name()+"',last_name='"+doctor.getLast_name()+"',password='"+doctor.getPassword()+"',gender='"+doctor.getGender()+"',phone='"+doctor.getPhone()+"',address='"+doctor.getAddress()+"',postal_code='"+doctor.getPostal_code()+"',languages='"+doctor.getLanguages()+"',skills='"+doctor.getSkills()+"',sunday='"+doctor.getSunday()+"',monday='"+doctor.getMonday()+"',tuesday='"+doctor.getTuesday()+"',wednesday='"+doctor.getWednesday()+"',thursday='"+doctor.getThursday()+"',friday='"+doctor.getFriday()+"',saturday='"+doctor.getSaturday()+"',sunday_time='"+doctor.getSunday_time()+"',monday_time='"+doctor.getMonday_time()+"',tuesday_time='"+doctor.getTuesday_time()+"',wednesday_time='"+doctor.getWednesday_time()+"',thursday_time='"+doctor.getThursday_time()+"',friday_time='"+doctor.getFriday_time()+"',saturday_time='"+doctor.getSaturday_time()+"' where email='"+demail+"'");
		 
		int result = query.executeUpdate();
		msg="Profile Updated Successfully";
		}catch(Exception e){
			msg="Fails to Update Profile";
		}
		session.close();
		sessionfactory.close();
		return msg;
	}

}
