package edu.depaul.cdm.se452.se452project.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "Customer")
public class Customer {

    @Id
    @GeneratedValue
    @Column(name = "CustomerId")
    private Long customerId;

    @Column(name = "FirstName")
    private String firstName;

    @Column(name = "LastName")
    private String lastName;

    @Column(name = "Address")
    private String address;

    @Column(name = "PhoneNumber")
    private String phoneNumber;

    @OneToMany(mappedBy = "customer")
    private List<Reservation> reservations = new ArrayList<>();
}
