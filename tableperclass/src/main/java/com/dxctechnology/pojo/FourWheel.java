package com.dxctechnology.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Four_vehicle_table_per_class")

public class FourWheel extends Vehical{
	
	@Column(name = "streeing_type")
	private String streeingWheel;
	@Column(name = "music_system")
	private String musicSystem;
	
	public String getStreeingWheel() {
		return streeingWheel;
	}
	public void setStreeingWheel(String streeingWheel) {
		this.streeingWheel = streeingWheel;
	}
	public String getMusicSystem() {
		return musicSystem;
	}
	public void setMusicSystem(String musicSystem) {
		this.musicSystem = musicSystem;
	}


}
