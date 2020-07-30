package com.dxctechnology.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dxctechnology.persistence.EmployeeInfo;

public class EmployeeMain {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");

		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		EmployeeInfo employee = new EmployeeInfo();
		employee.setEmpId(101);
		employee.setEmpName("munna");
		employee.setEmpSalary(543000);

		session.persist(employee);
		
		transaction.commit();
		session.close();
		System.out.println("Successfully completed");

	}

}
