package com.jiretec.jirehManagement.dto;

import com.jiretec.jirehManagement.entity.ProductEntity;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class ProductDTO {
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

    public ProductEntity toEntity() {
        return new ProductEntity(null, productInOut, department, requestor, productName, productMaker, fieldName, productCheckNumber, productBigo);
    }
}
