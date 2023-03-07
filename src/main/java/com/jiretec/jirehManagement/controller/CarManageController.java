package com.jiretec.jirehManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarManageController {

    @GetMapping("/carDaily")
    public String carManageList() {
        return "car/dailyCarMove";
    }

    @GetMapping("/carMainList")
    public String carSelect(){
        return "car/carSelect";
    }
}
