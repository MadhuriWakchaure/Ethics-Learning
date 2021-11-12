package com.mahindra.eng.infrastructure.repository;

import com.mahindra.eng.infrastructure.entity.AnnualCalendar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnnualCalendarRepository extends JpaRepository<AnnualCalendar,Long> {
}
