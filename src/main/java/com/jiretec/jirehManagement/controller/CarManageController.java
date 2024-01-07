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
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

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

    //이전에 사용한 자동차 등록 리스트
    @GetMapping("/carMainList")
    public String carSelect(){
        return "car/carSelect";
    }

    /*
    //2023.12.21 - 새롭게 작업한 자동차 등록 리스트: db에 등록한 차를 리스트로 보여주기!!!
    @GetMapping("/carRegisterList/{carRegistrationId}")
    public String carRegisterList(@PathVariable Long carRegistrationId, Model model) {

        // 1: id를 Entity로 가져옴.
        CarRegistrationEntity carRegistrationEntity = carRegistrationRepository.findById(carRegistrationId).orElse(null);

        // 2: 가져온 데이터를 모델에 등록.
        model.addAttribute("carRegistrationList", carRegistrationEntity);

        // 3: 보여줄 페이지 설정.
        return "car/carRegisterList";
    }
    */

    //2023.12.21 - 새롭게 작업한 자동차 등록 리스트: db에 등록한 차의 전체리스트로 보여주기!!!
    @GetMapping("/carRegistrationList")
    public String carRegisterList(Model model) {

        // 1: 모든 등록된 차의 리스트를 가져온다.
        //CarRegistrationEntity carRegistrationEntity = carRegistrationRepository.findById(carRegistrationId).orElse(null);

        List<CarRegistrationEntity> carRegisterList = carRegistrationRepository.findAll();


        // 2: 가져온 데이터를 모델에 등록.
        model.addAttribute("carRegistrationList", carRegisterList);

        // 3: 보여줄 페이지 설정.
        return "car/carRegistrationList";
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

        return "redirect:/carRegistrationList";

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
