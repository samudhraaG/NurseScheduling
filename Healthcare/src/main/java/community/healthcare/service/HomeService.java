package community.healthcare.service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



import community.healthcare.model.Doctor;

import community.healthcare.model.Patient;

public class HomeService {
	
	SessionFactory sessionfactory=new Configuration().configure().buildSessionFactory();
	Session session=sessionfactory.openSession();
	
public String hreg(Doctor doctor)
{
	session.beginTransaction();
	String msg=null;
	try{
	session.save(doctor);
	session.getTransaction().commit();
	msg="Registration Success";
	}catch(Exception e){
		msg="Fails to Register.Email Alredy Exit";
	}
	session.close();
	sessionfactory.close();
	return msg;
}
public String preg(Patient patient)
{
	session.beginTransaction();
	String msg=null;
	try{
	session.save(patient);
	session.getTransaction().commit();
	msg="Registration Success";
	}catch(Exception e){
	msg="Fails to Register.Email Alredy Exit";
	}
	session.close();
	sessionfactory.close();
	return msg;
}
public boolean hlog(Doctor doctor) {
	String hql="from Doctor where email="+doctor.getEmail();
	session.beginTransaction();
	Query query=session.createQuery("from Doctor where email='"+doctor.getEmail()+"' and password='"+doctor.getPassword()+"'");
	List<Doctor> data=(List<Doctor>)query.list();
	boolean status;
	if(data.isEmpty())
	{
		status=false;
	}else
	{
		status=true;
	
	}
	return status;
}
public boolean plog(Patient patient) {
	
	String hql="from Doctor where email="+patient.getEmail();
	session.beginTransaction();
	Query query=session.createQuery("from Patient where email='"+patient.getEmail()+"' and password='"+patient.getPassword()+"'");
	List<Doctor> data=(List<Doctor>)query.list();
	boolean status;
	if(data.isEmpty())
	{
		status=false;
	}else
	{
		status=true;
	}
	return status;
}
}
