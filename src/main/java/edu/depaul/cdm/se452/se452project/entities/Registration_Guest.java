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
@Table(name = "Registration_Guest")
public class Registration_Guest {
    
    @Id
    @Column(name="ID")
    private int automated_ID;

    @Column(name="GuestFirstName")
    private String guestFirstName;

    @Column(name="GuestLastName")
    private String guestLastName;

    @Column(name="Address")
    private String address;

    @Column(name="InsuranceCarrier")
    private String insuranceCarrier;

    @Column(name="DriversLicense")
    private String driversLicense;
    
   


    
}
