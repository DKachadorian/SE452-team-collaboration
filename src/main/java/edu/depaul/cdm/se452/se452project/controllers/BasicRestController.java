package edu.depaul.cdm.se452.se452project.controllers;

import edu.depaul.cdm.se452.se452project.entities.Car;
import edu.depaul.cdm.se452.se452project.entities.Customer;
import edu.depaul.cdm.se452.se452project.entities.Reservation;
import edu.depaul.cdm.se452.se452project.repositories.CarRepository;
import edu.depaul.cdm.se452.se452project.services.TableConstraintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BasicRestController {

    CarRepository carRepository;
    TableConstraintService tableConstraintService;

    public BasicRestController(@Autowired CarRepository carRepository, TableConstraintService tableConstraintService) {
        this.carRepository = carRepository;
        this.tableConstraintService = tableConstraintService;
    }

    @GetMapping(value ="/entries", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Car> addNewTestPage() {
        return carRepository.findAll();
    }


    @GetMapping(value = "/getReservations", consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<Reservation> getReservations(@RequestBody Long customerId) {
        return tableConstraintService.getAllReservationsForUser(customerId);
    }

}
