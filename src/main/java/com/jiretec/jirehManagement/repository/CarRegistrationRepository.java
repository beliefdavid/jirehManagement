package com.jiretec.jirehManagement.repository;

import com.jiretec.jirehManagement.entity.CarEntity;
import com.jiretec.jirehManagement.entity.CarRegistrationEntity;
import org.springframework.data.repository.CrudRepository;

public interface CarRegistrationRepository extends CrudRepository<CarRegistrationEntity, Long> {
}
