package edu.depaul.cdm.se452.se452project.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "Dealership")
public class Dealership {

    @Id
    @Column(name = "DealershipId")
    private long dealershipId; // this will be referenced by car table, employee table

    @Column(name = "Address")
    private String address;

    @Column(name = "State")
    private String state;

    @Column(name = "ZipCode")
    private String zipCode;

    // Collection of CarIDs for this DealershipId
}
