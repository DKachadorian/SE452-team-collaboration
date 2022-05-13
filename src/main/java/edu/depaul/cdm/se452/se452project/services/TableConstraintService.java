package edu.depaul.cdm.se452.se452project.services;

import edu.depaul.cdm.se452.se452project.entities.Car;
import edu.depaul.cdm.se452.se452project.repositories.CustomerRepository;
import edu.depaul.cdm.se452.se452project.repositories.DealershipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class TableConstraintService {

    DealershipRepository dealershipRepository;

    @Autowired
    TableConstraintService(
            DealershipRepository dealershipRepository) {

        this.dealershipRepository = dealershipRepository;
    }

    public List<Car> getAllDealershipCars(Long dealershipId) {
        return dealershipRepository.getById(dealershipId).getCars();
    }

}
