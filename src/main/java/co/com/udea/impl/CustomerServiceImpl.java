package co.com.udea.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.udea.repository.CustomerRepository;
import co.com.udea.service.CustomerService;
import co.com.udea.entity.Customer;

@Service

public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository iClienteRepository;
	@Override
	public Customer save(Customer customer) {
		return CustomerRepository.save(customer);
	}

	@Override
	public List<Customer> findAll() {
		return CustomerRepository.findAll();
	}

	@Override
	public Customer findById(Integer id) {
		return CustomerRepository.findById(id).get();
	}
}
