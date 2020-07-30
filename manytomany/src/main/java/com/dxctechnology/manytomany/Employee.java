package com.dxctechnology.manytomany;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table (name = "emp_table")
public class Employee {

	@Id
	@Column(name = "emp_id")
	private int empId;
	@Column(name = "emp_name", length = 50)
	private String empName;
	@Column(name = "emp_salary")
	private double empSalary;

	@ManyToMany	 (cascade = CascadeType.ALL)
	@JoinTable (name = "employee_meetings_table", 
	joinColumns = {@JoinColumn (name= "emp_id")},
	inverseJoinColumns = {@JoinColumn (name = "meeting_id")})

	private Set<Meetings> meetingSet = new HashSet<Meetings>();

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public Set<Meetings> getMeetingSet() {
		return meetingSet;
	}
	public void setMeetingSet(Set<Meetings> meetingSet) {
		this.meetingSet = meetingSet;
	}
}
