package edu.depaul.cdm.se452.se452project.dto;

import edu.depaul.cdm.se452.se452project.entities.Reservation;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class ReservationSearch {

    private long id;
    private Reservation reservation;
    //private List<Reservation> reservationList;
}
