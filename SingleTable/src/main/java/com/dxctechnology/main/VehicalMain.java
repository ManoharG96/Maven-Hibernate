package com.dxctechnology.main;

import org.hibernate.Session;

import com.dxctechnology.getsession.GetSession;
import com.dxctechnology.pojo.FourWheel;
import com.dxctechnology.pojo.TwoWheel;

public class VehicalMain {

	public static void main(String[] args) {

		
		TwoWheel twoVehical = new TwoWheel();
		twoVehical.setVehicalId(100);
		twoVehical.setVehicalName("KTM");
		twoVehical.setStreeingHandle("Normal Handle");
		
		FourWheel fourWheel = new FourWheel();
		fourWheel.setVehicalId(200);
		fourWheel.setVehicalName("I20");
		fourWheel.setStreeingWheel("Power Streeting");
		fourWheel.setMusicSystem("JBL Music System");
		
		Session session = GetSession.getSession();
		
		session.persist(twoVehical);
		session.persist(fourWheel);
		
		session.beginTransaction().commit();
		session.getSessionFactory().close();
	}

}
