package com.mahindra.eng.service;

import com.mahindra.eng.infrastructure.entity.ELModule;
import com.mahindra.eng.model.ModuleDTO;

public interface ModuleService {
    public ELModule getModuleList(Long id);
    public ELModule saveModule(ModuleDTO moduleDTO);
    public ELModule saveOrUpdate(Long id, ModuleDTO moduleDTO);
}
