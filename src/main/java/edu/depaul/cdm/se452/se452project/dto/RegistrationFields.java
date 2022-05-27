package edu.depaul.cdm.se452.se452project.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;

@Getter
@Setter
@ToString
public class RegistrationFields {

   
    private Date startDate;
    private Date endDate;
    private String optionalCriteria;
    private String requireCriteria;
    private String searchCity;

}
