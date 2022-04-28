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
@Table(name = "Employee")
public class Employee {

    @Id
    @Column(name = "EmployeeId")
    private long employeeId;

    @Column(name = "FirstName")
    private String firstName;

    @Column(name = "LastName")
    private String lastName;

    @Column(name = "Role")
    private String role;

    @Column(name = "DealershipId")
    private long dealershipId; // NEEDS FOREIGN KEY LINK TO LOCATION TABLE
}
