package com.jiretec.jirehManagement.dto;

import com.jiretec.jirehManagement.entity.Product;

public class ProductForm {
    // 입출고
    private String productInOut;
    //부서
    private String department;
    //요청자
    private String requestor;
    //자재명
    private String productName;
    //제조사
    private String productMaker;
    //현장명
    private String fieldName;
    //자재수량
    private String productCheckNumber;
    //비고
    private String productBigo;

    public ProductForm(String productInOut, String department, String requestor, String productName, String productMaker, String fieldName, String productCheckNumber, String productBigo) {
        this.productInOut = productInOut;
        this.department = department;
        this.requestor = requestor;
        this.productName = productName;
        this.productMaker = productMaker;
        this.fieldName = fieldName;
        this.productCheckNumber = productCheckNumber;
        this.productBigo = productBigo;
    }

    @Override
    public String toString() {
        return "ProductForm{" +
                "productInOut='" + productInOut + '\'' +
                ", department='" + department + '\'' +
                ", requestor='" + requestor + '\'' +
                ", productName='" + productName + '\'' +
                ", productMaker='" + productMaker + '\'' +
                ", fieldName='" + fieldName + '\'' +
                ", productCheckNumber='" + productCheckNumber + '\'' +
                ", productBigo='" + productBigo + '\'' +
                '}';
    }

    public Product toEntity() {
        return new Product(null, productInOut, department, requestor, productName, productMaker, fieldName, productCheckNumber, productBigo);
    }
}
