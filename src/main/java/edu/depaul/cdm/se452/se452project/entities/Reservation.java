package edu.depaul.cdm.se452.se452project.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "Reservation")
public class Reservation {

    @Id
    @GeneratedValue
    @Column(name = "ReservationId")
    private Long reservationId;

    @Column(name = "ReservationDate")
    private Date reservationDate;

    @Column(name = "StartDate")
    private Date startDate;

    @Column(name = "EndDate")
    private Date endDate;

    @Column(name = "DaysReserved")
    private int daysReserved;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "CustomerId")
    private Customer customer;

    // CarId Column

}
