package edu.depaul.cdm.se452.se452project.controllers.rest;

import edu.depaul.cdm.se452.se452project.entities.Car;
import edu.depaul.cdm.se452.se452project.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CarRestController {

    CarRepository carRepository;

    public CarRestController(@Autowired CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @GetMapping(value ="/allCars", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    @GetMapping(value ="/singleCar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Car> getSingleCustomer(@RequestBody Long carId) {
        return carRepository.findById(carId);
    }

    @DeleteMapping(value ="/deleteCar", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void deleteCustomer(@RequestBody Long carId) {
        carRepository.deleteById(carId);
    }
}
