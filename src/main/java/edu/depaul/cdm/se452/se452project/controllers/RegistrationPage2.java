package edu.depaul.cdm.se452.se452project.controllers;

import edu.depaul.cdm.se452.se452project.entities.Registration;
import edu.depaul.cdm.se452.se452project.repositories.RegistrationReposity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RegistrationPage2 {

    RegistrationReposity registrationReposity;
    
    public RegistrationPage2(@Autowired RegistrationReposity registrationReposity){
        this.registrationReposity = registrationReposity;  
    }

    @GetMapping(value="/entries_registration", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Registration> addNewRegistrations(){
        return registrationReposity.findAll();
    }
    
}
