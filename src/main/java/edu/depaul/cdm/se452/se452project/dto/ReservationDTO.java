package edu.depaul.cdm.se452.se452project.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ReservationDTO {

    private Long selectedDealershipId;
    private Long selectedCarId;
}
