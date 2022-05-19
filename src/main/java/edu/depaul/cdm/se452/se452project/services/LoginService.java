package edu.depaul.cdm.se452.se452project.services;

import edu.depaul.cdm.se452.se452project.dto.LoginFields;
import edu.depaul.cdm.se452.se452project.repositories.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService {

    Logger logger = LoggerFactory.getLogger(LoginService.class);

    CustomerRepository customerRepository;

    @Autowired
    public LoginService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public boolean validateLoginCredentials(LoginFields loginFields) {

        try {
            Optional.of(customerRepository.findUserByLogin(loginFields.getUsername(), loginFields.getPassword()))
                    .orElseThrow(RuntimeException::new);
        } catch (Exception e) {
            logger.error("Credentials not found in DB");
            return false;
        }
        return true;
    }
}
