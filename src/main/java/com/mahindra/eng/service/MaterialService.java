package com.mahindra.eng.service;

import com.mahindra.eng.infrastructure.entity.Material;
import com.mahindra.eng.model.MaterialDTO;

public interface MaterialService {
    public Material saveMaterial(MaterialDTO materialDTO);
    public Material getMaterialList(Long id);
    public Material saveOrUpdate(Long id,MaterialDTO materialDTO);


}
