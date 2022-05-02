package edu.depaul.cdm.se452.se452project.controllers;

import edu.depaul.cdm.se452.se452project.entities.CarReturn;
import edu.depaul.cdm.se452.se452project.repositories.CarReturnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class CarReturnController {

    CarReturnRepository carReturnRepository;

    public CarReturnController(@Autowired CarReturnRepository carReturnRepository) {
        this.carReturnRepository = carReturnRepository;
    }

    @GetMapping(value ="/singleCarReturnLog", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<CarReturn> getCarReturnLog(@RequestBody Long returnId) {
        return carReturnRepository.findById(returnId);
    }

    @PostMapping(value ="/submitCarReturnLog", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void submitCarReturnLog(@RequestBody CarReturn carReturn) {
        carReturnRepository.save(carReturn);
    }

    @DeleteMapping(value ="/deleteCarReturnLog", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void deleteCarReturnLog(@RequestBody Long returnId) {
        carReturnRepository.deleteById(returnId);
    }

}
