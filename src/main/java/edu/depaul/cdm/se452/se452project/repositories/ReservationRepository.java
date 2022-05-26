package edu.depaul.cdm.se452.se452project.repositories;

import edu.depaul.cdm.se452.se452project.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    @Query(value = "SELECT * FROM Reservation WHERE reservationId = ?1", nativeQuery = true)
    Reservation findReservationById(Long reservationId);

    @Modifying
    @Query(value = "DELETE FROM Reservation WHERE reservationId = ?1", nativeQuery = true)
    void removeReservationById(Long reservationId);

    @Query(value = "SELECT * FROM Reservation ORDER BY startDate DESC", nativeQuery = true)
    List<Reservation> FindAllReservations();

    @Query(value = "SELECT * FROM Reservation WHERE reservationId = ?1 ORDER BY startDate DESC", nativeQuery = true)
    List<Reservation> FindCustReservations(Long reservationId);

}