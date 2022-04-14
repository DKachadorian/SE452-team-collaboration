package edu.depaul.cdm.se452.se452project.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "TestTable")
public class TestTable {

    @Id
    @Column(name = "TestId")
    private long testId;
    
    @Column(name = "FirstName")
    private String firstName;
}
