package edu.depaul.cdm.se452.se452project.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@Entity
@Table(name = "Dealership")
public class Dealership {

    @Id
    @GeneratedValue
    @Column(name = "DealershipId")
    private Long dealershipId;

    @Column(name = "Address")
    private String address;

    @Column(name = "State")
    private String state;

    @Column(name = "ZipCode")
    private String zipCode;

    @OneToMany(mappedBy = "dealership", cascade = CascadeType.ALL)
    private List<Car> cars = new ArrayList<>();
}
