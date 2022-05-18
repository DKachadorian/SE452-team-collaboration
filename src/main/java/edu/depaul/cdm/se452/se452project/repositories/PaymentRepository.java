package edu.depaul.cdm.se452.se452project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.depaul.cdm.se452.se452project.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long>{}
