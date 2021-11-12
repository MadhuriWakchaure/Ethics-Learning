package com.mahindra.eng.service.impl;

import com.mahindra.eng.infrastructure.entity.Material;
import com.mahindra.eng.infrastructure.repository.MaterialRepository;
import com.mahindra.eng.model.MaterialDTO;
import com.mahindra.eng.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialServiceImpl implements MaterialService {
    private MaterialRepository materialRepository;
    @Autowired
    public void MaterialServiceImpl(MaterialRepository materialRepository){
        this.materialRepository=materialRepository;
    }
    @Override
    public Material saveMaterial(MaterialDTO materialDTO){
        Material material= Material.builder()
                .id(materialDTO.getId())
                .materialPath(materialDTO.getMaterialPath())
                .description(materialDTO.getDescription())
                .externalUrl(materialDTO.getExternalUrl())
                .thumbnail(materialDTO.getThumbnail())
                .mediaType(materialDTO.getMediaType())
                .title(materialDTO.getTitle())
                .moduleType(materialDTO.getModuleType())
                .createdBy(materialDTO.getCreatedBy())
                .createdDate(materialDTO.getCreatedDate())
                .updatedBy(materialDTO.getUpdatedBy())
                .updatedDate(materialDTO.getUpdatedDate())
                .status(materialDTO.getStatus())
                .build();
        return materialRepository.save(material);
    }


    public Material getMaterialList(Long id) {
        return materialRepository.findById(id).get();
    }
    @Override
    public Material saveOrUpdate(Long id,MaterialDTO materialDTO) {
        if (materialRepository.existsById(id)) {
            Material material = materialRepository.findById(id).get();
            material.setMaterialPath(materialDTO.getMaterialPath());
            material.setDescription(materialDTO.getDescription());
            material.setMediaType(materialDTO.getMediaType());
            material.setTitle(materialDTO.getTitle());
            material.setCompanyId(materialDTO.getCompanyId());
            material.setDescription(materialDTO.getDescription());
            material.setExternalUrl(materialDTO.getExternalUrl());
            material.setThumbnail(materialDTO.getThumbnail());
            material.setModuleType(materialDTO.getModuleType());
            material.setUpdatedBy(materialDTO.getUpdatedBy());
            material.setUpdatedDate(materialDTO.getUpdatedDate());
            material.setCreatedBy(materialDTO.getCreatedBy());
            material.setCreatedDate(materialDTO.getCreatedDate());
            material.setStatus(material.getStatus());
            return materialRepository.save(material);

        } else {
            return null;
        }
    }
        public List<Material> findByModuleType(String moduleName, int limit) {


            return  materialRepository.findByModuleType(moduleName,limit);
        }

        }





