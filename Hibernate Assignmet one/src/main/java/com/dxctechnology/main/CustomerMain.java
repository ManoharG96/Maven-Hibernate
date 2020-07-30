package com.dxctechnology.main;

import java.time.LocalDate;
import java.util.List;

import com.dxctechnology.operation.CustomerOperation;
import com.dxctechnology.pojo.Customer;

public class CustomerMain {

	public static void main(String[] args) {

		CustomerOperation operation = new CustomerOperation();
		
		Customer customerObject = new Customer(); 
		customerObject.setCustId(125);
		customerObject.setCustName("Dattu");
		customerObject.setCustDOB(LocalDate.of(1997, 07, 26));
		customerObject.setCustEmail("puppy@gmail.com"); 
		int count = operation.addCustomer(customerObject); 
		if (count>0) {
			System.out.println("successfully added to the database"); 
		}
		
		List<Customer> list = operation.showAllCustomer();
		for (Customer customer : list) {
			System.out.println(customer);
		}
		
		operation.deleteCustomer(127);
		
		operation.updateCustomer(126, "puppy");

	}

}
