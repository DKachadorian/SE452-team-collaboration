package edu.depaul.cdm.se452.se452project.services;

import edu.depaul.cdm.se452.se452project.dto.ReservationSearch;
import edu.depaul.cdm.se452.se452project.repositories.ReservationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReservationSearchService {

    Logger logger = LoggerFactory.getLogger(ReservationSearchService.class);

    ReservationRepository reservationRepository;

    @Autowired
    public ReservationSearchService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;}

    public boolean validateReservation(ReservationSearch reservationSearch) {

        try {
            Optional.of(reservationRepository.findReservationById(reservationSearch.getId()))
                    .orElseThrow(RuntimeException::new);
        } catch (Exception e) {
            logger.error("Reservation not found in DB: " + reservationSearch.getId() );
            return false;
        }
        return true;
    }
}
