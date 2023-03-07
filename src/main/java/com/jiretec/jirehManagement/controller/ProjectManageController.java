package com.jiretec.jirehManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectManageController {

    @GetMapping("/projectList")
    public String projectList(){
        return "/project/projectList";
    }
}
