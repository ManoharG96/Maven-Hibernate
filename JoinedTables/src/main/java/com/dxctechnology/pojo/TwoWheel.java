package com.dxctechnology.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Two_vehicle_table_joined")
public class TwoWheel extends Vehical{
	@Column(name = "streeing_type")
	private String StreeingHandle;

	public String getStreeingHandle() {
		return StreeingHandle;
	}

	public void setStreeingHandle(String streeingHandle) {
		StreeingHandle = streeingHandle;
	}
	

}
