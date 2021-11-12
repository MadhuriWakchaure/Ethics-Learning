package com.mahindra.eng.infrastructure.repository;

import com.mahindra.eng.infrastructure.entity.Material;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MaterialRepository extends JpaRepository<Material,Long> {
    @Query(value = "select * from eng_material where module_type =?1 limit ?2",nativeQuery = true)
    List<Material> findByModuleType(String  moduleName, int limit);


    List<Material> findByModuleType(Long id);
}
