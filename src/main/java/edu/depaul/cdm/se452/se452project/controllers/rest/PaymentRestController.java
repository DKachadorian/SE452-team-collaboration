package edu.depaul.cdm.se452.se452project.controllers.rest;

import edu.depaul.cdm.se452.se452project.entities.Payment;
import edu.depaul.cdm.se452.se452project.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class PaymentRestController {

    PaymentRepository paymentRepository;

    @Autowired
    public PaymentRestController(PaymentRepository paymentRepository){
        this.paymentRepository = paymentRepository;
    }

    @GetMapping(value = "/singlePayment", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Payment> getPayment(@RequestBody Long accountId) {
        return paymentRepository.findById(accountId);
    }
}
