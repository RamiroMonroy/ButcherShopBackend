package co.com.udea.service;


import java.util.List;

import co.com.udea.entity.Customer;

public class CustomerService {
	
	public Customer save(Customer customer);
	
	public List<Customer> findAll();
	
	public Customer findById(Integer id);
	
}