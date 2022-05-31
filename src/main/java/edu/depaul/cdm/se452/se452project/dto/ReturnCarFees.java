package edu.depaul.cdm.se452.se452project.dto;

import edu.depaul.cdm.se452.se452project.entities.Customer;
import edu.depaul.cdm.se452.se452project.entities.Dealership;
import edu.depaul.cdm.se452.se452project.entities.Reservation;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ReturnCarFees {

    private Long rentalId;

    private Double rentalFee;
    private Double extrasFee;
    private Double gasFee;
    private Double lateFee;
    private Double damageFee;
    private Double totalFee;

}