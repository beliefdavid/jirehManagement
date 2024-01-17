package com.jiretec.jirehManagement.controller;

import com.jiretec.jirehManagement.dto.CarManageDTO;
import com.jiretec.jirehManagement.entity.CarManageEntity;
import com.jiretec.jirehManagement.repository.CarManageRepository;
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
    private CarManageRepository carManageRepository;

    @GetMapping("/carDaily")
    public String carManageList() {
        return "car/dailyCarMove";
    }

    //2023.12.21 - 새롭게 작업한 자동차 등록 리스트: db에 등록한 차의 전체리스트로 보여주기!!!
    @GetMapping("/carRegistrationList")
    public String carRegisterList(Model model) {

        // 1: 모든 등록된 차의 리스트를 가져온다.
        //CarRegistrationEntity carRegistrationEntity = carRegistrationRepository.findById(carRegistrationId).orElse(null);
        List<CarManageEntity> carRegisterList = carManageRepository.findAll();

        // 2: 가져온 데이터를 모델에 등록.
        model.addAttribute("carRegistrationList", carRegisterList);

        // 3: 보여줄 페이지 설정.
        return "car/registration/carRegistrationList";
    }

    //차량 등록 페이지 이동.
    @GetMapping("/carRegistration")
    public String carRegistration() {
        return "car/registration/carRegistration";
    }

    //차량 등록작업
    @PostMapping("/carRegistrationProc")
    public String carRegistrationProc(CarManageDTO carDTO) {

        CarManageEntity carManageEntity = carDTO.toEntity();
        log.info(carManageEntity.toString());

        CarManageEntity saved = carManageRepository.save(carManageEntity);
        log.info(saved.toString());

        return "redirect:/carRegistrationList";

    }

    // 1.차량 업데이트 및 삭제페이지로 이동!!
    @GetMapping("/carEditDel")
    public String carEditDelManage(Model model) {

        // 1: 모든 등록된 차의 리스트를 가져온다.
        //CarRegistrationEntity carRegistrationEntity = carRegistrationRepository.findById(carRegistrationId).orElse(null);
        List<CarManageEntity> carRegisterList = carManageRepository.findAll();

        // 2: 가져온 데이터를 모델에 등록.
        model.addAttribute("carRegistrationList", carRegisterList);

        // 3: 보여줄 페이지 설정.
        return "car/editDel/carEditDelManage";
    }

    //1-1.차량 수정화면으로 이동.
    @GetMapping("/carEdit/{carRegistrationId}")
    public String carEdit(@PathVariable Long carRegistrationId, Model model){

        //수정할 데이터를 가져오기!
        CarManageEntity carManageEntity = carManageRepository.findById(carRegistrationId).orElse(null);

        //모델에 데이터를 등록!
        model.addAttribute("carRegistration", carManageEntity);


        //뷰페이지 설정!
        return "car/editDel/carEdit";
    }

    //1-2. 차량 업데이트 작업
    @PostMapping("/carUpdate")
    public String carUpdate(CarManageDTO carManageDTO){

        CarManageEntity carManageEntity = carManageDTO.toEntity();
        log.info(carManageEntity.toString());

        CarManageEntity target = carManageRepository.findById(carManageEntity.getCarRegistrationId()).orElse(null);

        if (target != null){
            carManageRepository.save(carManageEntity);
        }


        return "redirect:/carEditDel";
    }

    //차량 삭제 작업


}
