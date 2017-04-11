package community.healthcare.service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import community.healthcare.model.Doctor;
import community.healthcare.model.PRequest;
import community.healthcare.model.Patient;

public class AgencyService {
	SessionFactory sessionfactory=new Configuration().configure().buildSessionFactory();
	Session session=sessionfactory.openSession();
	public List<Doctor> aviewdoctor() {
		    session.beginTransaction();
			Query query=session.createQuery("from Doctor");
			List<Doctor> data=(List<Doctor>)query.list();
			
			return data;
	
	}
	public List<Patient> aviewpatient() {
		     session.beginTransaction();
			Query query=session.createQuery("from Patient");
			List<Patient> data=(List<Patient>)query.list();
			return data;
	}
	
	public List<PRequest> aviewstatus() {
		session.beginTransaction();
		Query query=session.createQuery("from PRequest");
		List<PRequest> data=(List<PRequest>)query.list();
		return data;
	}
	public String acancelconform(int requestId, String note) {
		session.beginTransaction();
		String msg=null;
		try{
			
			Query query=session.createQuery("update PRequest set note='"+note+"',status='Cancelled by Agency' where  requestId='"+requestId+"'");
		 
		int result = query.executeUpdate();
		msg="Request Cancelled Successfully";
		}catch(Exception e){
			msg="Fails to Cancel Request";
		}
		session.close();
		sessionfactory.close();
		return msg;

	}
	public String aassinconform(int requestId, int doctorId,String note) {
		session.beginTransaction();
		String msg=null;
		try{
			
			Query query=session.createQuery("update PRequest set note='"+note+"',status='Assigned to Healthcare Giver',doctorId='"+doctorId+"' where  requestId='"+requestId+"'");
		 
		int result = query.executeUpdate();
		msg="Assigned to Health Care Professional  Successfully";
		}catch(Exception e){
			msg="Fails to Assigned";
		}
		session.close();
		sessionfactory.close();
		return msg;

	}
	public List<Doctor> viewdoctor(int doctorId) {
		session.beginTransaction();
		Query query=session.createQuery("from Doctor where doctorId='"+doctorId+"'");
		List<Doctor> data=(List<Doctor>)query.list();
		
		return data;
	}

}
