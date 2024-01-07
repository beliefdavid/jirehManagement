package com.jiretec.jirehManagement.controller;

import com.jiretec.jirehManagement.dto.ProductDTO;
import com.jiretec.jirehManagement.entity.ProductEntity;
import com.jiretec.jirehManagement.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class ProductManageController {

    @Autowired // 스프링부트가 미리 생성해놓은 객체를 가져다가 자동 연결!
    private ProductRepository productRepository;

    @GetMapping("/productList")
    public String ProductList(){
        return "/product/productList";
    }

    @GetMapping("/productInOutWrite")
    public String ProductWrite(){
        return "/product/productInOutWrite";
    }

    @PostMapping("/productInOutSummit")
    public String ProductInOutSummit(ProductDTO form) {

//        System.out.println(form.toString());
        log.info(form.toString());


        //1.Dto를 변환! Entity!
        ProductEntity productEntity = form.toEntity();
//        System.out.println(product);
        log.info(productEntity.toString());

        //2.Repository에게 Entity를 DB에 저장하게 일을 시킴!
        ProductEntity saved = productRepository.save(productEntity);
//        System.out.println(saved);
        log.info(saved.toString());

        return "";
    }
}
