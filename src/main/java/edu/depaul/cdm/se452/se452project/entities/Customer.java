package edu.depaul.cdm.se452.se452project.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity
@Table(name="Customers")

public class Customer {

    @Id
    @Column(name="CustomerID")
    private int customerID;

    @Column(name="FisrtName")
    private String firstName;

    @Column(name="LastName")
    private String lastName;

    @Column(name="Age")
    private int age;

    @Column(name="Address")
    private String address;

    @Column(name="InsuranceCarrier")
    private String insuranceCarrier;

    @Column(name="DriversLicense")
    private String driversLicense;



    
    
}
