package edu.depaul.cdm.se452.se452project.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;


@Getter
@Setter
@Entity
@Table(name="Payment")
public class Payment {

    @Id
    @GeneratedValue
    @Column(name = "AccountId")
    private Long accountId;

    @Column(name = "CardType")
    private String cardType;

    @Column(name = "CardNumber")
    private Long cardNumber;

    @Column(name = "ExpirationDate")
    private Date expirationDate;

    @Column(name = "CVV")
    private Short cvv;

    @Column(name = "Currency")
    private String currency;

    @Column(name = "CardHolderName")
    private String cardHolderName;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "CustomerId")
    private Customer customer;
    
}
