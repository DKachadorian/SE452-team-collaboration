package edu.depaul.cdm.se452.se452project.controllers;

import edu.depaul.cdm.se452.se452project.entities.Customer;
import edu.depaul.cdm.se452.se452project.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController {

        CustomerRepository customerRepository;

        public CustomerController(@Autowired CustomerRepository customerRepository) {
            this.customerRepository = customerRepository;
        }

        @GetMapping(value ="/allCustomers", produces = MediaType.APPLICATION_JSON_VALUE)
        public List<Customer> getAllCustomers() {
            return customerRepository.findAll();
        }

        @GetMapping(value ="/singleCustomer", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
        public Optional<Customer> getSingleCustomer(@RequestBody Long customerId) {
            return customerRepository.findById(customerId);
        }

        @DeleteMapping(value ="/deleteCustomer", consumes = MediaType.APPLICATION_JSON_VALUE)
        public void deleteCustomer(@RequestBody Long customerId) {
            customerRepository.deleteById(customerId);
        }

}
