package com.mahindra.eng.service;

import com.mahindra.eng.infrastructure.entity.Contant;
import com.mahindra.eng.model.ContantDTO;

public interface ContantService {
    public Contant saveContant(ContantDTO contantDTO);
    public Contant getContantList(Long id);
    public Contant saveOrUpdate(Long id, ContantDTO contantDTO);

}
