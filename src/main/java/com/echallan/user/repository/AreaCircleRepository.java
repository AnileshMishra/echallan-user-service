package com.echallan.user.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.echallan.user.model.AreaCircle;

public interface AreaCircleRepository extends JpaRepository<AreaCircle, Long> {

	List<AreaCircle> findAllByStateCodeAndDistrictCodeAndIsActive(String stateCode, String districtCode, Integer isActive);

}
