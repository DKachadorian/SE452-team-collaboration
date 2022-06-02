package edu.depaul.cdm.se452.se452project.dto;

import edu.depaul.cdm.se452.se452project.entities.Car;
import edu.depaul.cdm.se452.se452project.entities.Dealership;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
public class RegistrationFields {

    private Long customerId;
    private String startD;
    private String endD;
    private Date startDate;
    private Date endDate;
    private String optionalCriteria;
    private String requiredCriteria;
    private String states;
    private String searchCity;
    private List<Dealership> dealershipList;
    private Long selectedDealershipId;
    private Long selectedCarId;
    private List<Car> carList;

}
