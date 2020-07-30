package com.dxctechnology.pojo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table (name = "vehical_table")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn (discriminatorType = DiscriminatorType.STRING, name = "vehical_type", length = 25)
@DiscriminatorValue (value = "Vehicle")
public class Vehical {
	
	@Id
	@Column(name = "vehical_id")
	private int vehicalId;
	@Column(name = "vehical_name", length = 50, nullable = false)
	private String vehicalName;
	
	public Vehical() {}
	
	public Vehical(int vehicalId, String vehicalName) {
		super();
		this.vehicalId = vehicalId;
		this.vehicalName = vehicalName;
	}
	public int getVehicalId() {
		return vehicalId;
	}
	public void setVehicalId(int vehicalId) {
		this.vehicalId = vehicalId;
	}
	public String getVehicalName() {
		return vehicalName;
	}
	public void setVehicalName(String vehicalName) {
		this.vehicalName = vehicalName;
	}
}
