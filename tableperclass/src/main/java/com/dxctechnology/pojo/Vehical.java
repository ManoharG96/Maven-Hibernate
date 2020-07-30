package com.dxctechnology.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table (name = "vehical_table_per_class")
@Inheritance (strategy = InheritanceType.TABLE_PER_CLASS)
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
