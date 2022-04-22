package edu.depaul.cdm.se452.se452project.controllers;

import edu.depaul.cdm.se452.se452project.entities.PaymentAccount;
import edu.depaul.cdm.se452.se452project.repositories.PaymentAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class PaymentAccountPage {

    PaymentAccountRepository paymentAccountRepository;

    public PaymentAccountPage(@Autowired PaymentAccountRepository paymentAccountRepository) {
        this.paymentAccountRepository = paymentAccountRepository;
    }

    @GetMapping(value ="/entriesPaymentAccount", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<PaymentAccount> addNewTestPage() {
        return paymentAccountRepository.findAll();
    }

}

