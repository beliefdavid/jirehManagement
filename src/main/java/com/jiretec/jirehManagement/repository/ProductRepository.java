package com.jiretec.jirehManagement.repository;

import com.jiretec.jirehManagement.entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<ProductEntity, Long> {
}
