package com.jiretec.jirehManagement.dto;

import com.jiretec.jirehManagement.entity.CarManageEntity;
import lombok.AllArgsConstructor;
import lombok.ToString;


@AllArgsConstructor
@ToString
public class CarManageDTO {

    private String carMaker;
    private String carName;
    private String carNumber;

    public CarManageEntity toEntity(){
        return new CarManageEntity(null, carMaker, carName, carNumber );
    }

}
