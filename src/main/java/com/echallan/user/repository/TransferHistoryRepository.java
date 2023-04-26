package com.echallan.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.echallan.user.model.TransferHistory;

@Repository
public interface TransferHistoryRepository extends JpaRepository<TransferHistory, Long> {

}
