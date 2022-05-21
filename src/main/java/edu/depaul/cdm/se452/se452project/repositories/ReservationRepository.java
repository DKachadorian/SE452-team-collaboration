package edu.depaul.cdm.se452.se452project.repositories;

import edu.depaul.cdm.se452.se452project.entities.Reservation;
import edu.depaul.cdm.se452.se452project.entities.Car;
import edu.depaul.cdm.se452.se452project.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    @Query(value = "SELECT * FROM Reservation WHERE reservationId = ?1", nativeQuery = true)
    Reservation findReservationById(Long reservationId);

}