package edu.depaul.cdm.se452.se452project.controllers;

import edu.depaul.cdm.se452.se452project.dto.CustomerRegistration;
import edu.depaul.cdm.se452.se452project.entities.Customer;
import edu.depaul.cdm.se452.se452project.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class CustomerController {

        CustomerRepository customerRepository;

        public CustomerController(@Autowired CustomerRepository customerRepository) {
            this.customerRepository = customerRepository;
        }

        @GetMapping("/accountCreate")
        public String accountCreate(Model model){
            model.addAttribute("customer",new Customer());
            model.addAttribute("customerRegistration", new CustomerRegistration());
            return "accountCreate";
        }
    
        @PostMapping("/accountVerification")
        public String accountVerification(@ModelAttribute(value="customerRegistration") CustomerRegistration customerRegistration, Model model){
            model.addAttribute("customerRegistration", customerRegistration);
            return "response";
        }

}
