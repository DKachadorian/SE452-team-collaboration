package edu.depaul.cdm.se452.se452project.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "Registrations")
public class Registration {
    
    @Id
    @Column(name="ID")
    private int automated_ID;
    
    @Column(name="UserName")
    private String userName;

    @Column(name="FirstName")
    private String firstName;

    @Column(name="LastName")
    private String lastName;

    @Column(name="Address")
    private String address;

    @Column(name="PaymentOptions")
    private String paymentOptions;

    @Column(name="InsuranceCarrier")
    private String insuranceCarrier;

    @Column(name="DriversLicense")
    private String driversLicense;
    
    @Column(name="Password")
    private String password;


    
}
