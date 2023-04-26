package com.echallan.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.echallan.user.model.State;

public interface StateRepository extends JpaRepository<State, Long> {

}
