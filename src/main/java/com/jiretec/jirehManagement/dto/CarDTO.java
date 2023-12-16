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

    private String carUseDate;
    private String carUserDepartment;
    private String carUseName;
    private String carPreMove;
    private String carPostMove;
    private String carResultMove;
    private String carCommuteMove;
    private String carWorkMove;
    private String carBigo;



    public CarEntity toEntity(){
        return new CarEntity(null, carMaker, carName, carNumber, carUseDate, carUserDepartment, carUseName, carPreMove, carPostMove, carResultMove, carCommuteMove, carWorkMove, carBigo);

    }

}

