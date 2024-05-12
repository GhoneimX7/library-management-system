package com.ghoneim.development.library.management.system.service;

import com.ghoneim.development.library.management.system.entity.Patron;
import com.ghoneim.development.library.management.system.repository.PatronRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatronService {

    @Autowired
    private PatronRepository patronRepository;

    public List<Patron> getPatrons(){
        return patronRepository.findAll();
    }
}
