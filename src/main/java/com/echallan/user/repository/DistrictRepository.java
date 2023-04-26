package com.echallan.user.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.echallan.user.model.District;

public interface DistrictRepository extends JpaRepository<District, Long> {

	List<District> findAllByStateCodeAndIsActive(String stateCode, Integer isActive);
}
