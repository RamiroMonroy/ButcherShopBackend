package co.com.udea.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.udea.service.CustomerService;
import co.com.udea.entity.Customer;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

	@Autowired
	private CustomerService Customer;

	@GetMapping(value = "/")
	private List<Customer> findAll() {
		return Customer.findAll();
	}

	@PostMapping(value = "/")
	private Customer save(@RequestBody Customer customer) {
		return Customer.save(customer);
	}
	
   @GetMapping(value = "/{id}")
   private Customer findById(@PathParam("id") Integer id) {
	   return Customer.findById(id);
   }

}
