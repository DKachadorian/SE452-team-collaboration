package edu.depaul.cdm.se452.se452project.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity
@Table(name="PaymentAccounts")

public class PaymentAccount {

    @Id
    @Column(name="CustomerID")
    private int customerID;

    @Column(name="FirstName")
    private String firstName;

    @Column(name="LastName")
    private String lastName;

    @Column(name="PaymentOptions")
    private String paymentOptions;

    @Column(name="CardType")
    private String cardType; // debit, credit

    @Column(name="CardNumber")
    private String cardNumber;

    @Column(name="SecurityCode")
    private String securityCode;
    
}
