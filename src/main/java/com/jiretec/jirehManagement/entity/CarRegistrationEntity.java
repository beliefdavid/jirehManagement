package com.jiretec.jirehManagement.entity;

import lombok.AllArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
@AllArgsConstructor
@ToString
public class CarRegistrationEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String carMaker;
    @Column
    private String carName;
    @Column
    private String carNumber;

}
