package edu.depaul.cdm.se452.se452project.services;

import edu.depaul.cdm.se452.se452project.dto.CustomerRegistration;
import edu.depaul.cdm.se452.se452project.entities.Customer;
import edu.depaul.cdm.se452.se452project.entities.Payment;
import edu.depaul.cdm.se452.se452project.repositories.CustomerRepository;
import edu.depaul.cdm.se452.se452project.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerRegistrationService {

    CustomerRepository customerRepository;
    PaymentRepository paymentRepository;

    @Autowired
    public CustomerRegistrationService(CustomerRepository customerRepository, PaymentRepository paymentRepository) {
        this.customerRepository = customerRepository;
        this.paymentRepository = paymentRepository;
    }

    public void persistData(CustomerRegistration customerRegistration) throws RuntimeException{


        if(customerRegistration == null) {
            throw new RuntimeException("Customer Form Failed to Register");
        }

        Customer customer = customerCreation(customerRegistration);
        Payment payment = paymentCreation(customerRegistration, customer);

        Optional.of(customer).map(Customer::getCustomerId).orElseThrow(() -> new RuntimeException("Customer creation failed."));
        Optional.of(payment).map(Payment::getAccountId).orElseThrow(() -> new RuntimeException("Payment creation failed."));

    }

    private Customer customerCreation(CustomerRegistration customerRegistration) {
        Customer customer = new Customer();

        customer.setFirstName(customerRegistration.getFirstName());
        customer.setLastName(customerRegistration.getLastName());
        customer.setUsername(customerRegistration.getUsername());
        customer.setPassword(customerRegistration.getPassword());
        customer.setAddress(customerRegistration.getPassword());
        customer.setState(customerRegistration.getState());
        customer.setZipCode(customerRegistration.getZipCode());
        customer.setPhoneNumber(customerRegistration.getPhoneNumber());

        return customerRepository.save(customer);
    }

    private Payment paymentCreation(CustomerRegistration customerRegistration, Customer customer) {
        Payment payment = new Payment();

        payment.setCardNumber(customerRegistration.getCardNumber());
        payment.setExpirationDate(customerRegistration.getExpirationDate());
        payment.setCvv(customerRegistration.getCvv());
        payment.setCardHolderName(customerRegistration.getCardHolderName());

        payment.setCustomer(customer);

        return paymentRepository.save(payment);
    }
}
