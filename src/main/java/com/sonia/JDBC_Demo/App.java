package com.sonia.JDBC_Demo;

import java.util.List;

import com.sonia.JDBC_Demo.dao.CustomerDao;
import com.sonia.JDBC_Demo.model.Customer;

public class App {
	public static void main(String[] args) {

/**
 * 
 * 
 * save 
 */

//		Customer cutomer = new Customer();
//		cutomer.setCustomerName("Milan Bamaniya");
//		cutomer.setContactName("Milan");
//		cutomer.setAddress("Ahmedabad");
//		cutomer.setCity("Ahmedabad");
//		cutomer.setPostalCode("123456");
//		cutomer.setCountry("India");
//
//		int status = CustomerDao.save(cutomer);
//		System.out.println(status + " row/s affected");

/**
 * 		update
 */
		
//		Customer cutomer = new Customer();
//		cutomer.setCustomerID(95);
//		cutomer.setCustomerName("Milan Bamaniya");
//		cutomer.setContactName("Milan");
//		cutomer.setAddress("Ahmedabad");
//		cutomer.setCity("Ahmedabad");
//		cutomer.setPostalCode("123456");
//		cutomer.setCountry("India");
//
//		int status = CustomerDao.update(cutomer);
//		System.out.println(status + " row/s affected");
		
		
/**
 * 	delete
 */
		
//		int status = CustomerDao.delete(96);
//		System.out.println(status + " row/s affected");
		
/*
 * 	getById
 */
		
//		Customer customer = CustomerDao.getCustomerById(95);
//		System.out.println(customer);
		
		/*
		 *  getAll
		 */
		
//		List<Customer> customers = CustomerDao.getAllCustomer();
//		for(Customer customer: customers)
//			System.out.println(customer);
		
	}
}
