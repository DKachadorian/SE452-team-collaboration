package edu.depaul.cdm.se452.se452project.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "Car")
public class Car {
    
    @Id
    @GeneratedValue
    @Column(name = "CarId")
    private Long carId;

    @Column(name = "CarVinId")
    private String carVinId;

    @Column(name = "CarManufacturer")
    private String carManufacturer;

    @Column(name = "CarModel")
    private String carModel;

    @Column(name = "CarClass")
    private String carClass;

    @Column(name = "CarPrice")
    private Double carPrice;

    @Column(name = "CarBabySeat")
    private Boolean babySeat;

    @Column(name = "CarSunroof")
    private Boolean carSunroof;

    @Column(name = "CarAvailable")
    private Boolean carAvailable;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "DealershipId")
    private Dealership dealership;

    @JsonIgnore
    @OneToOne(mappedBy = "car", cascade = CascadeType.ALL)
    private Reservation reservation;

}
