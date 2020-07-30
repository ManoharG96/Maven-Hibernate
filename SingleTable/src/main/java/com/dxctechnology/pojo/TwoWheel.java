package com.dxctechnology.pojo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue (value = "Two Wheel Vehicle")
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
