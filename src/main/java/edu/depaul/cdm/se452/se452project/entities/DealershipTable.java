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
@Table(name = "DealershipTable")
public class DealershipTable {

    @Id
    @Column(name = "DealershipId")
    private long dealershipID; // this will be referenced by car table, employee table

    @Column(name = "Address")
    private String address;

    @Column(name = "State")
    private String state;

    @Column(name = "ZipCode")
    private String zipcode;
}
