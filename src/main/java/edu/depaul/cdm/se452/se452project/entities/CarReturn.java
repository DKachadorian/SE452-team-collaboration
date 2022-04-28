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
@Table(name = "CarReturn")
public class CarReturn {

    @Id
    @Column(name = "ReturnId")
    private long returnId;

    // Most likely CustomerId

    @Column(name = "RentalId")
    private long rentalId; // ?? LINK TO RENTAL ID???

    @Column(name = "CarId")
    private long carId; //  ADD FOREIGN KEY LINK TO CAR ID

    @Column(name = "EmployeeId")
    private long employeeId; // ADD FOREIGN KEY LINK TO EMPLOYEE ID (for employee processing the return)

    @Column(name = "DealershipId")
    private long dealershipId; // ADD FOREIGN KEY LINK TO DEALERSHIP ID (for physical location of car when returned)??

    //=====FEES AND ALL THAT JAZZ =====

    @Column(name = "LateReturn")
    private boolean lateReturn; // can we have an auto fee if this is true???

    @Column(name = "GasTankFull")
    private boolean fullTank;

    @Column(name = "ReturnMileage")
    private long returnMileage; // usually some sort of general fee based on total trip mileage???? idk how rental works

    @Column(name = "InteriorDamage")
    private boolean interiorDamage;

    @Column(name = "InteriorNotes")
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
