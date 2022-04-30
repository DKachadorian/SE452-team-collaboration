package edu.depaul.cdm.se452.se452project.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "Registrations")
public class Registration {
    
    @Id
    @Column(name="ID")
    private int ID;
    
    @Column(name="UserName")
    private String userName;

    @Column(name="Password")
    private String password;
    
}
