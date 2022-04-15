package edu.depaul.cdm.se452.se452project.repositories;
import edu.depaul.cdm.se452.se452project.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CarRepository extends JpaRepository<Car,Long>{
    @Override
    List<Car> findAll();
}
