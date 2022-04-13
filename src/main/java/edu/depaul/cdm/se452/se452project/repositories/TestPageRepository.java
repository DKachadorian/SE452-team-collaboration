package edu.depaul.cdm.se452.se452project.repositories;

import edu.depaul.cdm.se452.se452project.entities.TestTable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TestPageRepository extends JpaRepository<TestTable, Long> {

    @Override
    List<TestTable> findAll();

}
