package com.mahindra.eng.infrastructure.repository;

import com.mahindra.eng.infrastructure.entity.UserModule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface UserModuleRepository extends JpaRepository<UserModule,Long> {
    List<UserModule> findByUserId(Long userId);
}
