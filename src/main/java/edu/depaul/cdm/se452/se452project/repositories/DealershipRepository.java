package edu.depaul.cdm.se452.se452project.repositories;

import edu.depaul.cdm.se452.se452project.entities.Dealership;
import edu.depaul.cdm.se452.se452project.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DealershipRepository extends JpaRepository<Dealership, Long> {

    @Query(value = "SELECT * FROM Dealership WHERE state = ?1", nativeQuery = true)
    List<Dealership> findDealershipsByState(String state);
}
