package edu.depaul.cdm.se452.se452project.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;

@Getter
@Setter
@ToString
public class CustomerRegistration {

    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;
    private String username;
    private String password;
    private String zipCode;
    private String state;
    private Long cardNumber;
    private Date expirationDate;
    private Short cvv;
    private String cardHolderName;

}
