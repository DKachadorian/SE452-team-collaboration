package edu.depaul.cdm.se452.se452project.controllers;

import edu.depaul.cdm.se452.se452project.dto.CustomerRegistration;
import edu.depaul.cdm.se452.se452project.dto.LoginFields;
import edu.depaul.cdm.se452.se452project.entities.Customer;
import edu.depaul.cdm.se452.se452project.repositories.CustomerRepository;
import edu.depaul.cdm.se452.se452project.services.CustomerRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class CustomerController {

        CustomerRegistrationService customerRegistrationService;

        public CustomerController(@Autowired CustomerRegistrationService customerRegistrationService) {
            this.customerRegistrationService = customerRegistrationService;
        }

        @ModelAttribute
        public void generateModel(Model model) {
            model.addAttribute("customerRegistration", new CustomerRegistration());
        }

        @GetMapping("/accountCreate")
        public String accountCreate(Model model){
            return "accountCreate";
        }
    
        @PostMapping("/accountVerification")
        public String accountVerification(@ModelAttribute(value="customerRegistration") CustomerRegistration customerRegistration){
            customerRegistrationService.persistData(customerRegistration);
            return "home";
        }
}
