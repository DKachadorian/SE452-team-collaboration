package edu.depaul.cdm.se452.se452project.services;

import edu.depaul.cdm.se452.se452project.entities.Reservation;
import edu.depaul.cdm.se452.se452project.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class TableConstraintService {

    CustomerRepository customerRepository;
    EntityManager entityManager;

    TableConstraintService(CustomerRepository customerRepository, EntityManager entityManager) {
        this.customerRepository = customerRepository;
        this.entityManager = entityManager;
    }

    public List<Reservation> getAllReservationsForUser(Long customerId) {
        return customerRepository.getById(customerId).getReservations();
    }

}
