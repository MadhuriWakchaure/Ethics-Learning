package com.mahindra.eng.infrastructure.repository;

import com.mahindra.eng.infrastructure.entity.CodeOfViolation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface    CodeOfViolationRepository extends JpaRepository<CodeOfViolation,Long> {

    List<CodeOfViolation> findByCompanyId(int id);

}
