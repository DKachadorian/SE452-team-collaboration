package edu.depaul.cdm.se452.se452project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.depaul.cdm.se452.se452project.entities.PaymentAccount;

import java.util.List;

public interface PaymentAccountRepository extends JpaRepository<PaymentAccount, Long>{
    
    @Override
    List<PaymentAccount> findAll();

}
