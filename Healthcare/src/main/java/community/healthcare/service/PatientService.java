package community.healthcare.service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import community.healthcare.model.Doctor;
import community.healthcare.model.PRequest;
import community.healthcare.model.Patient;

public class PatientService {

	SessionFactory sessionfactory=new Configuration().configure().buildSessionFactory();
	Session session=sessionfactory.openSession();
	public List<Patient> pprofile(String pemail) {
		session.beginTransaction();
		Query query=session.createQuery("from Patient where email='"+pemail+"'");
		List<Patient> data=(List<Patient>)query.list();
		return data;
	}
	public String pupdateprofile(Patient patient, String pemail) {
		session.beginTransaction();
		String msg=null;
		try{
			Query query=session.createQuery("update Patient set first_name='"+patient.getFirst_name()+"',last_name='"+patient.getLast_name()+"',password='"+patient.getPassword()+"',gender='"+patient.getGender()+"',phone='"+patient.getPhone()+"',address='"+patient.getAddress()+"',postal_code='"+patient.getPostal_code()+"' where email='"+pemail+"'");
		 
		int result = query.executeUpdate();
		msg="Profile Updated Successfully";
		}catch(Exception e){
			msg="Fails to Update Profile";
		}
		session.close();
		sessionfactory.close();
		return msg;
	}
	public List<Doctor> aviewdoctor() {
		session.beginTransaction();
		Query query=session.createQuery("from Doctor");
		List<Doctor> data=(List<Doctor>)query.list();
		
		return data;
	}
	public List<Doctor> prequest() {
		session.beginTransaction();
		Query query=session.createQuery("from Doctor");
		List<Doctor> data=(List<Doctor>)query.list();
		return data;
	}
	public String prequestsubmit(PRequest prequest) {
		session.beginTransaction();
		String msg=null;
		try{
		session.save(prequest);
		session.getTransaction().commit();
		msg="Request Registred Successfully";
		}catch(Exception e){
			msg="Fails to Register Request";
		}
		session.close();
		sessionfactory.close();
		return msg;
	}
	public List<PRequest> pviewstatus(String pemail) {
		session.beginTransaction();
		Query query=session.createQuery("from PRequest where patientEmail='"+pemail+"'");
		List<PRequest> data=(List<PRequest>)query.list();
		return data;
	}
	public String pcancelconform(int requestId, String note) {
		session.beginTransaction();
		String msg=null;
		try{
			
			Query query=session.createQuery("update PRequest set note='"+note+"',status='Cancelled by Patient' where  requestId='"+requestId+"'");
		 
		int result = query.executeUpdate();
		msg="Request Cancelled Successfully";
		}catch(Exception e){
			msg="Fails to Cancel Request";
		}
		session.close();
		sessionfactory.close();
		return msg;
	}

}
