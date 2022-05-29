package edu.depaul.cdm.se452.se452project.repositories;
import edu.depaul.cdm.se452.se452project.entities.Car;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CarRepository extends JpaRepository<Car, Long> {

    @Query(value = "SELECT * FROM Car WHERE dealershipId = ?1 AND carAvailable = TRUE AND carClass = ?2 AND carManufacturer = ?3", nativeQuery = true)
    List<Car> findCarByAllRequirements(long dealership, String carClass, String carManufacturer);

    @Query(value = "SELECT * FROM Car WHERE dealershipId = ?1 AND carAvailable = TRUE AND carClass = ?2", nativeQuery = true)
    List<Car> findCarBySomeRequirements(long dealership, String carClass);

    @Query(value = "SELECT * FROM Car WHERE carId = ?1", nativeQuery = true)
    List<Car> findCarListById(long id);

    @Query(value = "SELECT * FROM Car WHERE carAvailable = TRUE", nativeQuery = true)
    List<Car> findAllAvailable();

    @Query(value = "SELECT DISTINCT carModel FROM Car", nativeQuery = true)
    List<String> findUniqueModels();
}