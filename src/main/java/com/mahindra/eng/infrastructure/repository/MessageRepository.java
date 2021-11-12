package com.mahindra.eng.infrastructure.repository;

import com.mahindra.eng.infrastructure.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<Message,Long> {
}
