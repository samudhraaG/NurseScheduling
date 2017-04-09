package community.healthcare.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Doctor {
@Id
@GeneratedValue
private int doctorId;
private String first_name;
private String last_name;

@Column(unique = true)
private String email;
private String password;
private String gender;
private String phone;
private String address;
private String postal_code;
private String languages;
private String skills;
private String sunday;
private String monday;
private String tuesday;
private String wednesday;
private String thursday;
private String friday;
private String saturday;
private String sunday_time;
private String monday_time;
private String tuesday_time;
private String wednesday_time;
private String thursday_time;
private String friday_time;
private String saturday_time;
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getLanguages() {
	return languages;
}
public void setLanguages(String languages) {
	this.languages = languages;
}
public String getSkills() {
	return skills;
}
public void setSkills(String skills) {
	this.skills = skills;
}
public String getSunday() {
	return sunday;
}
public void setSunday(String sunday) {
	this.sunday = sunday;
}
public String getMonday() {
	return monday;
}
public void setMonday(String monday) {
	this.monday = monday;
}
public String getTuesday() {
	return tuesday;
}
public void setTuesday(String tuesday) {
	this.tuesday = tuesday;
}
public String getWednesday() {
	return wednesday;
}
public void setWednesday(String wednesday) {
	this.wednesday = wednesday;
}
public String getThursday() {
	return thursday;
}
public void setThursday(String thursday) {
	this.thursday = thursday;
}
public String getFriday() {
	return friday;
}
public void setFriday(String friday) {
	this.friday = friday;
}
public String getSaturday() {
	return saturday;
}
public void setSaturday(String saturday) {
	this.saturday = saturday;
}
public String getSunday_time() {
	return sunday_time;
}
public void setSunday_time(String sunday_time) {
	this.sunday_time = sunday_time;
}
public String getMonday_time() {
	return monday_time;
}
public void setMonday_time(String monday_time) {
	this.monday_time = monday_time;
}
public String getTuesday_time() {
	return tuesday_time;
}
public void setTuesday_time(String tuesday_time) {
	this.tuesday_time = tuesday_time;
}
public String getWednesday_time() {
	return wednesday_time;
}
public void setWednesday_time(String wednesday_time) {
	this.wednesday_time = wednesday_time;
}
public String getThursday_time() {
	return thursday_time;
}
public void setThursday_time(String thursday_time) {
	this.thursday_time = thursday_time;
}
public String getFriday_time() {
	return friday_time;
}
public void setFriday_time(String friday_time) {
	this.friday_time = friday_time;
}
public String getSaturday_time() {
	return saturday_time;
}
public void setSaturday_time(String saturday_time) {
	this.saturday_time = saturday_time;
}
public int getDoctorId() {
	return doctorId;
}
public void setDoctorId(int doctorId) {
	this.doctorId = doctorId;
}
public String getFirst_name() {
	return first_name;
}
public void setFirst_name(String first_name) {
	this.first_name = first_name;
}
public String getLast_name() {
	return last_name;
}
public void setLast_name(String last_name) {
	this.last_name = last_name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getPostal_code() {
	return postal_code;
}
public void setPostal_code(String postal_code) {
	this.postal_code = postal_code;
}




}
