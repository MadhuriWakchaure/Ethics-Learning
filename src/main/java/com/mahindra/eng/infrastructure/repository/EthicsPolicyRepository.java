package com.mahindra.eng.infrastructure.repository;

import com.mahindra.eng.infrastructure.entity.CodeOfViolation;
import com.mahindra.eng.infrastructure.entity.EthicsPolicy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EthicsPolicyRepository extends JpaRepository<EthicsPolicy,Long> {

    List<EthicsPolicy> findByCompanyId(Long id);
}
