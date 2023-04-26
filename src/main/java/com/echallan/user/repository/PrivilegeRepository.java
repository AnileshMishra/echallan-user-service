package com.echallan.user.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.echallan.user.model.Privilege;

@Repository
public interface PrivilegeRepository extends JpaRepository<Privilege, Long> {

	List<Privilege> findByIsActive(Integer isActive);
	
	Privilege findByPrivilegeId(Long privilegeId);
}
