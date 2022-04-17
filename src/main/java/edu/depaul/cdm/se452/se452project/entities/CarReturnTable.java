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
@Table(name = "CarReturnTable")
public class CarReturnTable {

    @Id
    @Column(name = "ReturnID")
    private long returnID;

    @Column(name = "RentalID")
    private long rentalID; // ?? LINK TO RENTAL ID???

    @Column(name = "CarID")
    private long carID; //  ADD FOREIGN KEY LINK TO CAR ID 

    @Column(name = "EmployeeID")
    private long employeeID; // ADD FOREIGN KEY LINK TO EMPLOYEE ID (for employee processing the return)

    @Column(name = "DealershipID")
    private long dealershipID; // ADD FOREIGN KEY LINK TO DEALERSHIP ID (for physical location of car when returned)??

    //=====FEES AND ALL THAT JAZZ =====

    @Column(name = "LateReturn")
    private boolean lateReturn; // can we have an auto fee if this is true???

    @Column(name = "GasTankFull")
    private boolean fullTank;

    @Column(name = "ReturnMileage")
    private long returnMileage; // usually some sort of general fee based on total trip mileage???? idk how rental works

    @Column(name = "InteriorDamage")
    private boolean interiorDamage;

    @Column(name = "interiorNotes")
    private String interiorNotes;

    @Column(name = "InteriorFee")
    private float interiorFee; // can we auto this to 0 if boolean is false???

    @Column(name = "ExteriorDamage")
    private boolean exteriorDamage;

    @Column(name = "ExteriorNotes")
    private String exteriorNotes;

    @Column(name = "ExteriorFee")
    private float exteriorFee; // ?? Can we auto this to 0 if boolean is false???

    @Column(name = "TotalFee")
    private float totalFee; // lateReturn fee + mileage fee + gas fee + damage fees



}
