package com.dxctechnology.pojo;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cust_table")
public class Customer {
	@Id
	@Column(name = "cust_id")
	private int custId;
	@Column(name = "cust_name")
	private String custName;
	@Column(name = "cust_dob")
	private LocalDate custDOB;
	@Column(name = "cust_email")
	private String custEmail;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public LocalDate getCustDOB() {
		return custDOB;
	}
	public void setCustDOB(LocalDate custDOB) {
		this.custDOB = custDOB;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custDOB=" + custDOB + ", custEmail="
				+ custEmail + "]";
	}
	
	
}
