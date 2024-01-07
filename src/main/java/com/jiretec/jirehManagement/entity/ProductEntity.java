package com.jiretec.jirehManagement.entity;

import lombok.AllArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@ToString
public class ProductEntity {
    @Id //대표값을 지정! 주민등록증과 같은 역할
    @GeneratedValue // 1,2,3, ....  자동 생성 어노테이션!
    private Long id;

    // 입출고
    @Column
    private String productInOut;
    //부서
    @Column
    private String department;
    //요청자
    @Column
    private String requestor;
    //자재명
    @Column
    private String productName;
    //제조사
    @Column
    private String productMaker;
    //현장명
    @Column
    private String fieldName;
    //자재수량
    @Column
    private String productCheckNumber;
    //비고
    @Column
    private String productBigo;
    
}
