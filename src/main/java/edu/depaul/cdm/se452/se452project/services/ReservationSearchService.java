package edu.depaul.cdm.se452.se452project.services;

import edu.depaul.cdm.se452.se452project.dto.LoginFields;
import edu.depaul.cdm.se452.se452project.dto.ReservationSearch;
import edu.depaul.cdm.se452.se452project.entities.Reservation;
import edu.depaul.cdm.se452.se452project.repositories.ReservationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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
            reservationSearch.setReservation(Optional.of(reservationRepository.findReservationById(reservationSearch.getId()))
                    .orElseThrow(RuntimeException::new));
        } catch (RuntimeException e) {
            logger.error("Reservation not found in DB: " + reservationSearch.getId() );
            return false;
        }
        return true;
    }

    public Reservation fetchReservation(Long id) {

        try {
            Reservation r = (Optional.of(reservationRepository.findReservationById(id))
                    .orElseThrow(RuntimeException::new));
            return r;
        } catch (RuntimeException e) {
            logger.error("Reservation not found in DB: " + id );
            return null;
        }
    }

    public List<Reservation> findAllReservations(Long customerId){
        List<Reservation> reservations;
        try {
            reservations = Optional.of(reservationRepository.findCustomerReservations(customerId))
                    .orElseThrow(RuntimeException::new);
        } catch (RuntimeException e) {
            logger.error("No Reservations");
            return null;
        }
        return reservations;
    }

    /*
    public List<Reservation> FindCustomerReservations(Long id){
        List<Reservation> reservations;
        try {
            reservations = Optional.of(reservationRepository.FindCustReservations(id))
                    .orElseThrow(RuntimeException::new);
        } catch (RuntimeException e) {
            logger.error("No Reservations");
            return null;
        }
        return reservations;
    }
    */
}
