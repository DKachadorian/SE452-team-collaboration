package edu.depaul.cdm.se452.se452project.controllers.rest;

import edu.depaul.cdm.se452.se452project.entities.Car;
import edu.depaul.cdm.se452.se452project.entities.Dealership;
import edu.depaul.cdm.se452.se452project.repositories.DealershipRepository;
import edu.depaul.cdm.se452.se452project.services.DealershipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class DealershipRestController {

    DealershipRepository dealershipRepository;
    DealershipService tableConstraintService;

    @Autowired
    public DealershipRestController(DealershipRepository dealershipRepository, DealershipService tableConstraintService) {
        this.dealershipRepository = dealershipRepository;
        this.tableConstraintService = tableConstraintService;
    }

    @GetMapping(value ="/allDealerships", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Dealership> getAllDealerships() {
        return dealershipRepository.findAll();
    }
    

    @GetMapping(value ="/singleDealership", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Dealership> getSingleDealership(@RequestBody Long dealershipId) {
        return dealershipRepository.findById(dealershipId);
    }

    @GetMapping(value ="/singleDealershipCars", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Car> getSingleDealershipCars(@RequestBody Long dealershipId) {
        return tableConstraintService.getAllDealershipCars(dealershipId);
    }

    @DeleteMapping(value ="/deleteDealership", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void deleteDealership(@RequestBody Long dealershipId) {
        dealershipRepository.deleteById(dealershipId);
    }
}
