package com.mahindra.eng.infrastructure.repository;

import com.mahindra.eng.infrastructure.entity.EthicsPolicy;
import com.mahindra.eng.infrastructure.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocationRepository extends JpaRepository<Location,Long> {
    List<Location> findByCompanyId(Long id);
}
