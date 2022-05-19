package edu.depaul.cdm.se452.se452project.dto;

import edu.depaul.cdm.se452.se452project.entities.Customer;
import edu.depaul.cdm.se452.se452project.entities.Dealership;
import edu.depaul.cdm.se452.se452project.entities.Employee;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;

@Getter
@Setter
@ToString
public class ReturnCarForm {

    private Long rentalId;
    private Dealership dealershipId;
    private Customer customerId;
    private Boolean lateReturn;
    private int fullTank;
    private Long returnMileage;
    private Boolean missingCarSeat;
    private Boolean damagedSunRoof;
    private Boolean interiorDamageDriver;
    private Boolean interiorDamagePassenger;
    private Boolean interiorDamageBack;
    private Boolean interiorDamageTrunk;
    private String interiorNotes;
    private Double interiorFee;
    private Boolean exteriorDamageFront;
    private Boolean exteriorDamageBack;
    private Boolean exteriorDamageLeft;
    private Boolean exteriorDamageRight;
    private String exteriorNotes;
    private Double exteriorFee;
    private Double totalFee;

}

