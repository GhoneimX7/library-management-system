package com.ghoneim.development.library.management.system.controller;

import com.ghoneim.development.library.management.system.entity.BorrowingRecord;
import com.ghoneim.development.library.management.system.service.BorrowingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/borrowing")
public class BorrowingRestController {

    @Autowired
    private BorrowingService borrowingService;

    @GetMapping()
    public ResponseEntity<List<BorrowingRecord>> borrowingRecords(){
        return new ResponseEntity<>(borrowingService.getRecords(), HttpStatus.OK);
    }

}
