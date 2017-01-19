package com.inse.spring.model;

import org.joda.time.LocalDate;

public class Nurse {
	private String nurseId;
	private String nurseSkill;
	private LocalDate timeAvailability;
	
	public String getNurseId() {
		return nurseId;
	}
	public void setNurseId(String nurseId) {
		this.nurseId = nurseId;
	}
	public String getNurseSkill() {
		return nurseSkill;
	}
	public void setNurseSkill(String nurseSkill) {
		this.nurseSkill = nurseSkill;
	}
	public LocalDate getTimeAvailability() {
		return timeAvailability;
	}
	public void setTimeAvailability(LocalDate timeAvailability) {
		this.timeAvailability = timeAvailability;
	}
}
