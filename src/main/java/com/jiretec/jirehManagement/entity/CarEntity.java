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
    private String carUseDate;
    @Column
    private String carUserDepartment;
    @Column
    private String carUseName;
    @Column
    private String carPreMove;
    @Column
    private String carPostMove;
    @Column
    private String carResultMove;
    @Column
    private String carCommuteMove;
    @Column
    private String carWorkMove;
    @Column
    private String carBigo;

}
