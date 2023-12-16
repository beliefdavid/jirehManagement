package com.jiretec.jirehManagement.dto;

import com.jiretec.jirehManagement.entity.CarRegistrationEntity;
import lombok.AllArgsConstructor;
import lombok.ToString;


@AllArgsConstructor
@ToString
public class CarRegistrationDTO {

    private String carMaker;
    private String carName;
    private String carNumber;

    public CarRegistrationEntity toEntity(){
        return new CarRegistrationEntity(null, carMaker, carName, carNumber );
    }

}
