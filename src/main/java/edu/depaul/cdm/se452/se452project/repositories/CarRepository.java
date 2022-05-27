package edu.depaul.cdm.se452.se452project.repositories;
import edu.depaul.cdm.se452.se452project.entities.Car;
import edu.depaul.cdm.se452.se452project.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {

    @Query(value = "SELECT * FROM Car WHERE dealership = ?1 AND carAvailable = TRUE AND carClass = ?2 AND carManufacturer = ?3", nativeQuery = true)
    List<Car> findCarByAllRequirements(long dealership, String carClass, String carManufacturer);

    @Query(value = "SELECT * FROM Car WHERE dealership = ?1 AND carAvailable = TRUE AND carClass = ?2", nativeQuery = true)
    List<Car> findCarBySomeRequirements(long dealership, String carClass);
}
