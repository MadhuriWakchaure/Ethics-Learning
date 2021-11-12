package com.mahindra.eng.infrastructure.repository;

import com.mahindra.eng.infrastructure.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company,Long> {
}
