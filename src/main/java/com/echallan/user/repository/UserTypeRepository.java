package com.echallan.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.echallan.user.model.UserType;

public interface UserTypeRepository extends JpaRepository<UserType, Long> {

}
