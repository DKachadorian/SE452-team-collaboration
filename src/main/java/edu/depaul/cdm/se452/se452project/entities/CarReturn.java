package edu.depaul.cdm.se452.se452project.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "CarReturn")
public class CarReturn {

    @Id
    @GeneratedValue
    @Column(name = "ReturnId")
    private Long returnId;

    @OneToOne
    @JoinColumn(name = "DealershipId")
    private Dealership dealership;

    @OneToOne
    @JoinColumn(name = "CustomerId")
    private Customer customer;

    @OneToOne
    @JoinColumn(name = "EmployeeId")
    private Employee employee;

    @Column(name = "LateReturn")
    private Boolean lateReturn;

    @Column(name = "FullTank")
    private Boolean fullTank;

    @Column(name = "ReturnMileage")
    private Long returnMileage;

    @Column(name = "InteriorDamage")
    private Boolean interiorDamage;

    @Column(name = "InteriorNotes")
    private String interiorNotes;

    @Column(name = "InteriorFee")
    private Double interiorFee;

    @Column(name = "ExteriorDamage")
    private Boolean exteriorDamage;

    @Column(name = "ExteriorNotes")
    private String exteriorNotes;

    @Column(name = "ExteriorFee")
    private Double exteriorFee;

    @Column(name = "TotalFee")
    private Double totalFee;
}
