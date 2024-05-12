package com.ghoneim.development.library.management.system.controller;

import com.ghoneim.development.library.management.system.entity.Patron;
import com.ghoneim.development.library.management.system.service.PatronService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/patrons")
public class PatronRestController {

    @Autowired
    private PatronService patronService;

    @GetMapping
    public ResponseEntity<List<Patron>> patrons(){
        return new ResponseEntity<>(patronService.getPatrons(), HttpStatus.OK);
    }
}
