package co.com.udea.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import co.com.udea.entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
