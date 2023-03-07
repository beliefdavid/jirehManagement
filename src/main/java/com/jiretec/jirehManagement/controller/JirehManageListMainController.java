package com.jiretec.jirehManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JirehManageListMainController {

    @GetMapping("/home")
    public String jirehMainList(){
        return "manageList";
    }
}
