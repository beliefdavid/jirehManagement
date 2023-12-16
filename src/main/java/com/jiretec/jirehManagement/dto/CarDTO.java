package com.jiretec.jirehManagement.dto;

import com.jiretec.jirehManagement.entity.CarEntity;
import com.jiretec.jirehManagement.entity.CarRegistrationEntity;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class CarDTO {

    private String carMaker;
    private String carName;
    private String carNumber;
    private String carMove;

    public CarEntity toEntity(){
        return new CarEntity(null, carMaker, carName, carNumber, carMove);
    }

}

