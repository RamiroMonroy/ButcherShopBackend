package co.com.udea.controller;

import java.util.List;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.istack.NotNull;

import co.com.udea.dto.CustomerDto;
import co.com.udea.entity.Customer;
import co.com.udea.service.CustomerService;

@RestController
@RequestMapping(value="/v1/customers")

@Validated
public class CustomerController {

	
	private CustomerService customerService;
	
	public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

	@GetMapping( value = "/")
	public ResponseEntity<List<CustomerDto>> findAll() {
        return ResponseEntity.ok(customerService.findAll());
    }

	public ResponseEntity<CustomerDto> create(@RequestBody @Valid CustomerDto customerDto) {
		CustomerDto customerCreate = customerService.create(customerDto);
        return new ResponseEntity<CustomerDto>(customerCreate, null, HttpStatus.CREATED);
    }
	
	@Validated
   @GetMapping(value = "/{id}")
	public ResponseEntity<CustomerDto> findById(
            @PathVariable @NotNull @Valid Integer id) {
        return ResponseEntity.ok(customerService.findById(id));
    }
	
	@DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        customerService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
