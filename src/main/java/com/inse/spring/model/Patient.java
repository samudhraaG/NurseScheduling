package com.inse.spring.model;

import org.joda.time.LocalDate;

public class Patient {
	private String patientName;
	private String patientAilment;
	private LocalDate patientPreferredTime;
	
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPatientAilment() {
		return patientAilment;
	}
	public void setPatientAilment(String patientAilment) {
		this.patientAilment = patientAilment;
	}
	public LocalDate getPatientPreferredTime() {
		return patientPreferredTime;
	}
	public void setPatientPreferredTime(LocalDate patientPreferredTime) {
		this.patientPreferredTime = patientPreferredTime;
	}
}
