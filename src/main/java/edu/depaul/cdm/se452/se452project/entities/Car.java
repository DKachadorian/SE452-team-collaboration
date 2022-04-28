package edu.depaul.cdm.se452.se452project.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "Car")
public class Car {
    
    @Id
    @GeneratedValue
    @Column(name = "CarId")
    private long carId;

    @Column(name = "CarVinId")
    private String carVinId;

    @Column(name = "CarManufacturer")
    private String carMake;

    @Column(name = "CarModel")
    private String carModel;

    @Column(name = "CarClass")
    private String carClass;

    @Column(name = "CarPrice")
    private Double carPrice;

    @Column(name = "CarSeat") //Booster Seat
    private boolean carSeat;

    @Column(name = "CarSunroof")
    private boolean carSunroof;

    //Flag for In/Out of Dealership

    //Needs DealershipId for Current Location Tracking


}
