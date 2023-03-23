package com.jiretec.jirehManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductManageController {

    @GetMapping("/productList")
    public String ProductList(){
        return "/product/productList";
    }

    @GetMapping("/productAdd")
    public String ProductAdd(){
        return "/product/productAdd";
    }
}
