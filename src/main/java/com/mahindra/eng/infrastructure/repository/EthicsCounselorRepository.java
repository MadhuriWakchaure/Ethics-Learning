package com.mahindra.eng.infrastructure.repository;

import com.mahindra.eng.infrastructure.entity.EthicsCounselor;
import com.mahindra.eng.infrastructure.entity.EthicsPolicy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EthicsCounselorRepository extends JpaRepository<EthicsCounselor,Long> {

    List<EthicsCounselor> findByLocationId(Long id);

    List<EthicsCounselor> findByCompanyId(Long id);
}
