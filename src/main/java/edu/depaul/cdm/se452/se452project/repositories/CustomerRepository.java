package edu.depaul.cdm.se452.se452project.repositories;

import edu.depaul.cdm.se452.se452project.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Query(value = "SELECT * FROM Customer WHERE username = ?1 AND password = ?2", nativeQuery = true)
    Customer findUserByLogin(String username, String password);
    //customerRepository.findUserByLogin(loginFields.getUsername(), loginFields.getPassword()))

}
