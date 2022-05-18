package edu.depaul.cdm.se452.se452project.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "Employee")
public class Employee {

    @Id
    @GeneratedValue
    @Column(name = "EmployeeId")
    private Long employeeId;

    @Column(name = "FirstName")
    private String firstName;

    @Column(name = "LastName")
    private String lastName;

    @Column(name = "JobTitle")
    private String jobTitle;

    @OneToOne
    @JoinColumn(name = "DealershipId")
    private Dealership dealership;
}
