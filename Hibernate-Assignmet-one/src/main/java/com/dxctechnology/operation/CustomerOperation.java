package com.dxctechnology.operation;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.dxctechnology.getsession.GetSession;
import com.dxctechnology.pojo.Customer;

public class CustomerOperation {


	public int addCustomer(Customer customer) {
		if (customer != null) {
			int count = 0;
			Session session = GetSession.getSession();
			session.beginTransaction();
			session.persist(customer);
			session.getTransaction().commit();
			session.close();
			return ++count;
		}
		return 0;
	}

	public List<Customer> showAllCustomer(){
		Session session = GetSession.getSession();
		session.beginTransaction();
		Query<Customer> query = session.createQuery("from Customer");
		List<Customer> customersList = query.list();

		if (customersList != null) {
			return customersList;
		}

		session.getTransaction().commit();
		session.getSessionFactory().close();
		return null;	
	}

	public Customer searchCustomer(int id) {
		Session session = GetSession.getSession();
		session.beginTransaction();
		Customer customer = session.get(Customer.class, id);
		if (customer!=null) {
			return customer;
		}
		session.getTransaction().commit();
		session.getSessionFactory().close();
		return null;
	}

	public void deleteCustomer(int id) {
		Session session = GetSession.getSession();
		session.beginTransaction();
		Customer customer = session.get(Customer.class, id);
		session.delete(customer);
		session.getTransaction().commit();
		if (customer!= null) {
			System.out.println("Deleted successfully");
		} else {
			System.out.println("Enter the correct Id");
		}
		session.getSessionFactory().close();
	}

	public void updateCustomer(int id, String name) {
		Session session = GetSession.getSession();
		session.beginTransaction();
		Customer customer = session.get(Customer.class, id);
		customer.setCustName(name);
		session.getTransaction().commit();
		if (customer!=null) {
			System.out.println("Name Updated successfully for Id "+id);
		}
		session.getSessionFactory().close();
	}
}
