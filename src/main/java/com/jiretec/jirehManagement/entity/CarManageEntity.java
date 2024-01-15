package com.jiretec.jirehManagement.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
public class CarManageEntity {

    @Id
    @GeneratedValue
    private Long carRegistrationId;

    @Column
    private String carMaker;
    @Column
    private String carName;
    @Column
    private String carNumber;

}
