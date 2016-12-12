package com.repository;

import com.domain.Kayttaja;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KayttajaRepository extends JpaRepository<Kayttaja, Long> {
    
}
