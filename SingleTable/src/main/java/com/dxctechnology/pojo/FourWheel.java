package com.dxctechnology.pojo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue (value = "Four Wheel Vehicle")
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
