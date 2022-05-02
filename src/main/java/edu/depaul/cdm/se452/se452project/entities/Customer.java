package edu.depaul.cdm.se452.se452project.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
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

    @Column(name = "DateOfBirth")
    private Date date;

    @Column(name = "Address")
    private String address;

    @Column(name = "PhoneNumber")
    private String phoneNumber;

    @Column(name = "DriversLicenseId")
    private Long driversLicenseId;

    @Column(name = "InsuranceCarrier")
    private String insuranceCarrier;

    @Column(name="Username")
    private String username;

    @Column(name="Password")
    private String password;

    @Column(name="Email")
    private String email;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Reservation> reservations = new ArrayList<>();

    @OneToOne(mappedBy = "customer", cascade = CascadeType.ALL)
    private Payment payment;
}
