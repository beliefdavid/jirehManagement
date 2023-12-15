package com.jiretec.jirehManagement.controller;

import com.jiretec.jirehManagement.dto.CarRegistrationDTO;
import com.jiretec.jirehManagement.entity.CarRegistrationEntity;
import com.jiretec.jirehManagement.repository.CarRegistrationRepository;
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
}
