package com.mahindra.eng.service.impl;

import com.mahindra.eng.infrastructure.entity.ELModule;
import com.mahindra.eng.infrastructure.repository.ModuleRepository;
import com.mahindra.eng.model.ModuleDTO;
import com.mahindra.eng.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModuleServiceImpl implements ModuleService {
    private ModuleRepository moduleRepository;

    @Autowired
    public void ModuleServiceImpl(ModuleRepository moduleRepository) {
        this.moduleRepository = moduleRepository;
    }

    @Override
    public ELModule getModuleList(Long id) {
        return moduleRepository.findById(id).get();
    }

    public ELModule saveModule(ModuleDTO moduleDTO) {
        ELModule module = ELModule.builder()
                .id(moduleDTO.getId())
                .name(moduleDTO.getName())
                .isInternal(moduleDTO.getIsInternal())
                .internalLink(moduleDTO.getInternalLink())
                .createdBy(moduleDTO.getCreatedBy())
                .createdDate(moduleDTO.getCreatedDate())
                .updatedBy(moduleDTO.getUpdatedBy())
                .updatedDate(moduleDTO.getUpdatedDate())
                .status(moduleDTO.getStatus())
                .build();
        return moduleRepository.save(module);
    }

    public ELModule saveOrUpdate(Long id, ModuleDTO moduleDTO) {
        if (moduleRepository.existsById(id)) {
            ELModule module = moduleRepository.findById(id).get();
            module.setName(moduleDTO.getName());
            module.setInternalLink(moduleDTO.getInternalLink());
            module.setIsInternal(moduleDTO.getIsInternal());
            module.setCreatedBy(moduleDTO.getCreatedBy());
            module.setCreatedDate(moduleDTO.getCreatedDate());
            module.setUpdatedBy(moduleDTO.getUpdatedBy());
            module.setUpdatedDate(moduleDTO.getUpdatedDate());
            module.setStatus(moduleDTO.getStatus());
            return moduleRepository.save(module);
        }
        else {
            return null;
        }
    }


}
