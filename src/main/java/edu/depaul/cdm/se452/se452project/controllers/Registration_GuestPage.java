package edu.depaul.cdm.se452.se452project.controllers;

import edu.depaul.cdm.se452.se452project.entities.Registration;
import edu.depaul.cdm.se452.se452project.entities.Registration_Guest;
import edu.depaul.cdm.se452.se452project.repositories.RegistrationReposity;
import edu.depaul.cdm.se452.se452project.repositories.Registration_GuestReposity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Registration_GuestPage {

    Registration_GuestReposity registrationGuestReposity;
    
    public Registration_GuestPage(@Autowired Registration_GuestReposity registrationGuestReposity){
        this.registrationGuestReposity = registrationGuestReposity;  
    }

    @GetMapping(value="/entries_registrationGuest", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Registration_Guest> addNewRegistrations(){
        return registrationGuestReposity.findAll();
    }
    
}
