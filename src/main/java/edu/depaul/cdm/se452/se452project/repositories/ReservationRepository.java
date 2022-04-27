package edu.depaul.cdm.se452.se452project.repositories;
import edu.depaul.cdm.se452.se452project.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation,Long>  {
    
    @Override
    List<Reservation> findAll();
}
