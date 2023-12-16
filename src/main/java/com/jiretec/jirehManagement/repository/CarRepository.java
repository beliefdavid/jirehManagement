package com.jiretec.jirehManagement.repository;

import com.jiretec.jirehManagement.entity.CarEntity;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<CarEntity, Long> {
}
