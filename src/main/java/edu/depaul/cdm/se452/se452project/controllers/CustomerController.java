package edu.depaul.cdm.se452.se452project.controllers;

import edu.depaul.cdm.se452.se452project.entities.Customer;
import edu.depaul.cdm.se452.se452project.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@Controller
public class CustomerController {

        CustomerRepository customerRepository;

        public CustomerController(@Autowired CustomerRepository customerRepository) {
            this.customerRepository = customerRepository;
        }

        @GetMapping("/accountCreate")
        public String getCustomer(Model model){
            model.addAttribute("customer",new Customer());
            return "accountCreate";
        }
    
        @PostMapping("/accountCreate")
        public String loadFromPage(Customer customer){
            customerRepository.save(customer);
            return "accountRecorded";
        }

}
