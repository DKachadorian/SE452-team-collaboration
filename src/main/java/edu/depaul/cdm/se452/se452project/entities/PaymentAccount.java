package edu.depaul.cdm.se452.se452project.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity
@Table(name="PaymentAccounts")

public class PaymentAccount {

    @Id
    @Column(name="CustomerID")
    private int customerID;

    @Column(name="d_license")
    private String driverLicense;

    @Column(name="carrier")
    private String insuranceCarrier;
    
}
