package com.mahindra.eng.infrastructure.repository;

import com.mahindra.eng.infrastructure.entity.ELModule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModuleRepository extends JpaRepository<ELModule,Long> {
}
