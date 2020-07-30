package com.dxctechnology.manytomany;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToManyMain {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		Meetings meeting0 = new Meetings(100, "Monthly meetings", LocalDate.of(2020, 05, 11));
		Meetings meeting1 = new Meetings(101, "Weekly meetings", LocalDate.of(2019, 07, 21));

		Employee employee0 = new Employee();
		employee0.setEmpId(200);
		employee0.setEmpName("munna");
		employee0.setEmpSalary(23654);
		employee0.getMeetingSet().add(meeting1);
		employee0.getMeetingSet().add(meeting0);

		Employee employee1 = new Employee();
		employee1.setEmpId(201);
		employee1.setEmpName("reddy");
		employee1.setEmpSalary(54328);
		employee1.getMeetingSet().add(meeting0);

		Employee employee2 = new Employee();
		employee2.setEmpId(202);
		employee2.setEmpName("pavi");
		employee2.setEmpSalary(34214);
		employee2.getMeetingSet().add(meeting0);
		employee2.getMeetingSet().add(meeting1);

		Employee employee3 = new Employee();
		employee3.setEmpId(203);
		employee3.setEmpName("gouda");
		employee3.setEmpSalary(45321);
		employee3.getMeetingSet().add(meeting1);

		session.persist(employee0);
		session.persist(employee1);
		session.persist(employee2);
		session.persist(employee3);
		
		transaction.commit();
		session.close();
		System.out.println("Successfully completed");
	}

}
