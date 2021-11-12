package com.mahindra.eng.infrastructure.repository;

import com.mahindra.eng.infrastructure.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country,Long> {

}
