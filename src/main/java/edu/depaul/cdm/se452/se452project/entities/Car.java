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
@Table(name = "Cars")
public class Car {
    
    @Id
    @GeneratedValue
    private long carID;

    @Column(name = "car_make")
    private String carMake;

    @Column(name = "car_model")
    private String carModel;

    @Column(name = "car_class")
    private String carClass;

    @Column(name = "car_price")
    private Double carPrice;

    @Column(name = "car_vin_id")
    private String carVINid;

    @Column(name = "car_seat")
    private boolean carSeat;

    @Column(name = "car_sunroof")
    private boolean carSunroof;


}
