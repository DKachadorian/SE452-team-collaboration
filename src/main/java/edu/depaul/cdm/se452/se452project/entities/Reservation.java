package edu.depaul.cdm.se452.se452project.entities;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Getter
@Setter
@Entity
@Table(name = "Reservations")
public class Reservation {
    
    @Id
    @GeneratedValue
    private long orderID;

    @Column(name = "order_date")
    private Date orderDate;

    @Column(name = "return_to_origin")
    private boolean returnToOrigin;

    @Column(name = "reservation_start_date")
    private Date reservationStartDate;

    @Column(name = "reservation_end_date")
    private Date reservationEndDate;

    @Column(name = "num_days_reserved")
    private int numberDaysReserved;
    

    public void bookReservation (){
        
    }

    public void pickUpCar(){
        
    }

    public void returnCar(){
        
    }


}
