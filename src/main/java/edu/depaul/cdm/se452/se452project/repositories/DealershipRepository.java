package edu.depaul.cdm.se452.se452project.repositories;

import edu.depaul.cdm.se452.se452project.entities.Dealership;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DealershipRepository extends JpaRepository<Dealership, Long> {

    @Query(value = "SELECT * FROM Dealership WHERE state = ?1", nativeQuery = true)
    List<Dealership> findDealershipsByState(String state);

    @Query(value = "SELECT * FROM Dealership WHERE dealershipId = ?1", nativeQuery = true)
    Dealership findDealershipsById(long id);

    @Query(value = "SELECT * FROM Dealership WHERE dealershipId = ?1", nativeQuery = true)
    List<Dealership> findDealershipsListById(long id);

    @Query(value = "SELECT * FROM Dealership ORDER BY state ASC", nativeQuery = true)
    List<Dealership> findAllOrdered();
}
