package com.jiretec.jirehManagement.repository;

import com.jiretec.jirehManagement.entity.CarManageEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface CarManageRepository extends CrudRepository<CarManageEntity, Long> {

    @Override
    ArrayList<CarManageEntity> findAll();
}
