package edu.depaul.cdm.se452.se452project.repositories;

import edu.depaul.cdm.se452.se452project.entities.Dealership;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DealershipRepository extends JpaRepository<Dealership, Long> {
    //create the query here
   // @Query(value = "SELECT * FROM DEALERSHIP GROUP BY State;", nativeQuery = true)
   // public List<Dealership>getDealershipsByState();
}
