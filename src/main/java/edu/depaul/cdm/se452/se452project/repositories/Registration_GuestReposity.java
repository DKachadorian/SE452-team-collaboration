package edu.depaul.cdm.se452.se452project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.depaul.cdm.se452.se452project.entities.Registration_Guest;

import java.util.List;

public interface Registration_GuestReposity extends JpaRepository<Registration_Guest, Long> {
    
    @Override
    List<Registration_Guest> findAll();
}
