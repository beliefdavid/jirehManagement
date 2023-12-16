package com.jiretec.jirehManagement.controller;

import com.jiretec.jirehManagement.dto.CarDTO;
import com.jiretec.jirehManagement.dto.CarRegistrationDTO;
import com.jiretec.jirehManagement.entity.CarEntity;
import com.jiretec.jirehManagement.entity.CarRegistrationEntity;
import com.jiretec.jirehManagement.repository.CarRegistrationRepository;
import com.jiretec.jirehManagement.repository.CarRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class CarManageController {

    @Autowired
    private CarRegistrationRepository carRegistrationRepository;

    @Autowired
    private CarRepository carRepository;

    @GetMapping("/carDaily")
    public String carManageList() {
        return "car/dailyCarMove";
    }

    @GetMapping("/carMainList")
    public String carSelect(){
        return "car/carSelect";
    }

    @GetMapping("/carRegistration")
    public String carRegistration() {
        return "car/carRegistration";
    }

    @PostMapping("/carRegistrationProc")
    public String carRegistrationProc(CarRegistrationDTO carDTO) {

        CarRegistrationEntity carEntity = carDTO.toEntity();
        log.info(carEntity.toString());

        CarRegistrationEntity saved = carRegistrationRepository.save(carEntity);
        log.info(saved.toString());

        return "";

    }

    @GetMapping("/carMoveWrite")
    public String carMove(){
        return "car/carMoveWrite";
    }

    @PostMapping("carMoveWriteProc")
    public String carMoveWriteProc(CarDTO carDTO){

        CarEntity carEntity = carDTO.toEntity();
        log.info(carEntity.toString());

        CarEntity saved = carRepository.save(carEntity);
        log.info(saved.toString());


        return "";
    }
}
