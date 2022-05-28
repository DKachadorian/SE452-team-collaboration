package edu.depaul.cdm.se452.se452project.repositories;

import edu.depaul.cdm.se452.se452project.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Transactional
@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    @Query(value = "SELECT * FROM Reservation WHERE reservationId = ?1", nativeQuery = true)
    Reservation findReservationById(Long reservationId);

    @Modifying
    @Query(value = "DELETE * FROM Reservation WHERE reservationId = ?1", nativeQuery = true)
    void removeReservationById(Long reservationId);

    @Query(value = "SELECT * FROM Reservation ORDER BY startDate DESC", nativeQuery = true)
    List<Reservation> FindAllReservations();

    @Query(value = "SELECT * FROM Reservation WHERE reservationId = ?1 ORDER BY startDate DESC", nativeQuery = true)
    List<Reservation> FindCustReservations(Long reservationId);

    @Modifying
    @Query(value = "INSERT INTO RESERVATION(ReservationDate, DaysReserved, ReturnToOrigin, StartDate, EndDate, CustomerId, CarId) VALUES(?1 , ?2 , true, ?3, ?4, ?5, ?6)", nativeQuery = true)
    void addReservation(Date current, Long days, Date start, Date end, Long cust, Long car);

}