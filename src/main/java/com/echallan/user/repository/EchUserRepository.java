package com.echallan.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.echallan.user.model.EchUser;

public interface EchUserRepository extends JpaRepository<EchUser, Integer> {

	EchUser findByUserId(Integer id);
}
