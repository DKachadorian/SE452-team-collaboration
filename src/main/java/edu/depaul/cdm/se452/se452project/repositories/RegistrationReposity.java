package edu.depaul.cdm.se452.se452project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.depaul.cdm.se452.se452project.entities.Registration;

import java.util.List;

public interface RegistrationReposity extends JpaRepository<Registration, Long> {
    
    @Override
    List<Registration> findAll();
}
