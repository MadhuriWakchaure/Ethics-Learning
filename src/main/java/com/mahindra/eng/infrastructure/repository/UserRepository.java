package com.mahindra.eng.infrastructure.repository;

import com.mahindra.eng.infrastructure.entity.User;
import com.mahindra.eng.infrastructure.entity.UserModule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByCompanyId(Integer companyId);
    List<User> findByIdAndCompanyId(Long id, Integer companyId);



}