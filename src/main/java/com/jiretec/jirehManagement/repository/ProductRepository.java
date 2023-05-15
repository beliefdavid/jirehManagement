package com.jiretec.jirehManagement.repository;

import com.jiretec.jirehManagement.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
