package com.ghoneim.development.library.management.system.repository;

import com.ghoneim.development.library.management.system.entity.Patron;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatronRepository extends JpaRepository<Patron, Long> {

}
