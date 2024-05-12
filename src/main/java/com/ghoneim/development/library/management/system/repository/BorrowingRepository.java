package com.ghoneim.development.library.management.system.repository;

import com.ghoneim.development.library.management.system.entity.BorrowingRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowingRepository extends JpaRepository<BorrowingRecord, Long> {

}
