package co.com.udea.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import co.com.udea.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
