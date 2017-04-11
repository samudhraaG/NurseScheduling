package community.healthcare.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PRequest {
	
@Id
@GeneratedValue	
private int requestId;
private String patientEmail;
private String datee;
private String timee;
private String requestType;
private String serviceRequestType;
private String location;
private String gender;
private int doctorId;
private String language;
private String description;
private String status;
private String note;

public int getRequestId() {
	return requestId;
}
public void setRequestId(int requestId) {
	this.requestId = requestId;
}
public String getDatee() {
	return datee;
}
public String getPatientEmail() {
	return patientEmail;
}
public void setPatientEmail(String patientEmail) {
	this.patientEmail = patientEmail;
}
public void setDatee(String datee) {
	this.datee = datee;
}
public String getTimee() {
	return timee;
}
public void setTimee(String timee) {
	this.timee = timee;
}
public String getRequestType() {
	return requestType;
}
public void setRequestType(String requestType) {
	this.requestType = requestType;
}
public String getServiceRequestType() {
	return serviceRequestType;
}
public void setServiceRequestType(String serviceRequestType) {
	this.serviceRequestType = serviceRequestType;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getDoctorId() {
	return doctorId;
}
public void setDoctorId(int doctorId) {
	this.doctorId = doctorId;
}
public String getLanguage() {
	return language;
}
public void setLanguage(String language) {
	this.language = language;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getNote() {
	return note;
}
public void setNote(String note) {
	this.note = note;
}



}
