package edu.depaul.cdm.se452.se452project.repositories;

import edu.depaul.cdm.se452.se452project.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query(value = "SELECT * FROM Employee WHERE username = ?1 AND password = ?2", nativeQuery = true)
    Employee findUserByLogin(String username, String password);
}
