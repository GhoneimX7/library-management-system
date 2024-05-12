package com.ghoneim.development.library.management.system.service;

import com.ghoneim.development.library.management.system.entity.BorrowingRecord;
import com.ghoneim.development.library.management.system.repository.BorrowingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowingService {

    @Autowired
    private BorrowingRepository borrowingRepository;

    public List<BorrowingRecord> getRecords(){
        return borrowingRepository.findAll();
    }
}
