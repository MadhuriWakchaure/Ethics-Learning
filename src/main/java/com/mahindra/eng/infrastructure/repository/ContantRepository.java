package com.mahindra.eng.infrastructure.repository;

import com.mahindra.eng.infrastructure.entity.Contant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContantRepository extends JpaRepository<Contant,Long> {
}
