package edu.depaul.cdm.se452.se452project.repositories;
import edu.depaul.cdm.se452.se452project.entities.Car;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CarRepository extends JpaRepository<Car, Long> {

   // @Query(value="SELECT carManufacturer FROM Car GROUP BY carManufacturer",nativeQuery = true)
   // List<Car> findDistinctByCarManufacturer();
}

/*
These are the distinct car manufacturers
[Acura, Aston Martin, Audi, BMW, Bentley, Buick, Cadillac, Chevrolet, Chrysler, Citroën, Daewoo, Dodge, Eagle, Fairthorpe, Ferrari, Ford, 
GMC, Geo, Hillman, Holden, Honda, Hummer, Hyundai, Infiniti, Isuzu, Jaguar, Jeep, Kia, Lamborghini, Land Rover, Lexus, Lincoln, Lotus, MINI, 
Maserati, Maybach, Mazda, Mercedes-Benz, Mercury, Mitsubishi, Morgan, Nissan, Oldsmobile, 
Peugeot, Plymouth, Pontiac, Porsche, Ram, Rolls-Royce, Saab, Saturn, Scion, Smart, Spyker, Subaru, Suzuki, Tesla, Toyota, Volkswagen, Volvo]'
*/