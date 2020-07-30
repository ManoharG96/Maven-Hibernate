package com.dxctechnology.manytomany;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table (name = "meetings_table")
public class Meetings {
	
	@Id
	@Column(name = "meeting_id")
	private int meetingId;
	@Column(name = "meeting_subject")
	private String meetingSubject;
	@Column(name = "meeting_date")
	private LocalDate meetingDate;
	
	@ManyToMany (mappedBy = "meetingSet")
	private Set<Employee> employeeSet = new HashSet<Employee>();

	
	public Meetings(int meetingId, String meetingSubject, LocalDate meetingDate) {
		super();
		this.meetingId = meetingId;
		this.meetingSubject = meetingSubject;
		this.meetingDate = meetingDate;
	}

	public int getMeetingId() {
		return meetingId;
	}

	public void setMeetingId(int meetingId) {
		this.meetingId = meetingId;
	}

	public String getMeetingSubject() {
		return meetingSubject;
	}

	public void setMeetingSubject(String meetingSubject) {
		this.meetingSubject = meetingSubject;
	}

	public LocalDate getMeetingDate() {
		return meetingDate;
	}

	public void setMeetingDate(LocalDate meetingDate) {
		this.meetingDate = meetingDate;
	}

	public Set<Employee> getEmployeeSet() {
		return employeeSet;
	}

	public void setEmployeeSet(Set<Employee> employeeSet) {
		this.employeeSet = employeeSet;
	}


}
