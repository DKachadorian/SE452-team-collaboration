package edu.depaul.cdm.se452.se452project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.depaul.cdm.se452.se452project.entities.Customer;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
    
    @Override
    List<Customer> findAll();

}
