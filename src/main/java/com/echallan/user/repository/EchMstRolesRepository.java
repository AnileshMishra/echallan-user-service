package com.echallan.user.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.echallan.user.model.EchMstRoles;

@Repository
public interface EchMstRolesRepository extends JpaRepository<EchMstRoles, Long> {

	List<EchMstRoles> findByIsActive(Integer isActive);
	
	EchMstRoles findByRoleId(Long id);

}
