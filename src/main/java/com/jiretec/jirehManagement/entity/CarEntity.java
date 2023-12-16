package com.jiretec.jirehManagement.entity;


import jdk.jfr.Timespan;
import lombok.AllArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@ToString
public class CarEntity {

    @Id
    @GeneratedValue
    private Long carId;

    @Column
    private String carMaker;
    @Column
    private String carName;
    @Column
    private String carNumber;
    @Column
    private String carMove;

}
