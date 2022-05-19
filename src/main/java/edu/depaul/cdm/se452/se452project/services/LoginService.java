package edu.depaul.cdm.se452.se452project.services;

import edu.depaul.cdm.se452.se452project.dto.LoginFields;
import edu.depaul.cdm.se452.se452project.repositories.CustomerRepository;
import edu.depaul.cdm.se452.se452project.repositories.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService {

    Logger logger = LoggerFactory.getLogger(LoginService.class);

    CustomerRepository customerRepository;
    EmployeeRepository employeeRepository;

    @Autowired
    public LoginService(CustomerRepository customerRepository, EmployeeRepository employeeRepository) {
        this.customerRepository = customerRepository; this.employeeRepository = employeeRepository;
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

    public boolean validateLoginCredentialsEmp(LoginFields loginFields) {

        try {
            Optional.of(employeeRepository.findUserByLogin(loginFields.getUsername(), loginFields.getPassword()))
                    .orElseThrow(RuntimeException::new);
        } catch (Exception e) {
            logger.error("Credentials not found in DB");
            return false;
        }
        return true;
    }
}
