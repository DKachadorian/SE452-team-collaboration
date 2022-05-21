package edu.depaul.cdm.se452.se452project.controllers.rest;

import edu.depaul.cdm.se452.se452project.entities.Reservation;
import edu.depaul.cdm.se452.se452project.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ReservationRestController {

    ReservationRepository reservationRepository;

    public ReservationRestController(@Autowired ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @GetMapping(value ="/allReservations", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    @GetMapping(value ="/singleReservation", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Reservation> getSingleReservation(@RequestBody Long reservationId) {
        return reservationRepository.findById(reservationId);
    }

    @GetMapping(value ="/ReservationSearch", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Reservation> getReservationSearch() {
        return reservationRepository.findAll();
    }
}

/*
@GetMapping(value ="/allCars", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }*/