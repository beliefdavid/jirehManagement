package com.jiretec.jirehManagement.repository;

import com.jiretec.jirehManagement.entity.CarRegistrationEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface CarRegistrationRepository extends CrudRepository<CarRegistrationEntity, Long> {

    @Override
    ArrayList<CarRegistrationEntity> findAll();
}
