package edu.depaul.cdm.se452.se452project.controllers;

import edu.depaul.cdm.se452.se452project.entities.Payment;
import edu.depaul.cdm.se452.se452project.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@Controller
public class PaymentController {

    PaymentRepository paymentRepository;

    public PaymentController(@Autowired PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

 
/*
    @GetMapping(value="/accountCreate")
    public String getPayment(Model model){
        model.addAttribute("payment",new Payment());
        return "accountCreate";
    }

    @PostMapping(value="/accountCreate")
    public String loadFromPage(Payment payment){
        paymentRepository.save(payment);
        return "accountRecorded";
    }
*/

}



