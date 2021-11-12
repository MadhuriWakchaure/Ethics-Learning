package com.mahindra.eng.service.impl;

import com.mahindra.eng.infrastructure.entity.CodeOfViolation;
import com.mahindra.eng.infrastructure.repository.CodeOfViolationRepository;
import com.mahindra.eng.model.CodeOfViolationDTO;
import com.mahindra.eng.service.CodeOfViolationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeOfViolationServiceImpl implements CodeOfViolationService {
    private CodeOfViolationRepository codeOfViolationRepository;

    @Autowired
    public void CodeOfViolationServiceImpl(CodeOfViolationRepository codeOfViolationRepository) {

        this.codeOfViolationRepository = codeOfViolationRepository;
    }

    @Override
    public CodeOfViolation saveCodeOfViolation(CodeOfViolationDTO codeOfViolationDTO) {
        CodeOfViolation codeOfViolation = CodeOfViolation.builder()
                .id(codeOfViolationDTO.getId())
                .groupName(codeOfViolationDTO.getGroupName())
                .description(codeOfViolationDTO.getDescription())
                .clouse(codeOfViolationDTO.getClouse())
                .actionTaken(codeOfViolationDTO.getActionTaken())
                .yearId(codeOfViolationDTO.getYearId())
                .companyId(codeOfViolationDTO.getCompanyId())
                .createdBy(codeOfViolationDTO.getCreatedBy())
                .createdDate(codeOfViolationDTO.getCreatedDate())
                .updatedBy(codeOfViolationDTO.getUpdatedBy())
                .updatedDate(codeOfViolationDTO.getUpdatedDate())
                .status(codeOfViolationDTO.getStatus())
                .build();
        return codeOfViolationRepository.save(codeOfViolation);
    }

    public CodeOfViolation getCodeOfViolationList(Long id) {
        return codeOfViolationRepository.findById(id).get();
    }

    public List<CodeOfViolation> getCodeOfViolationList(int id) {
        return codeOfViolationRepository.findByCompanyId(id);
    }

    public CodeOfViolation saveOrUpdate(Long id, CodeOfViolationDTO codeOfViolationDTO) {
        if (codeOfViolationRepository.existsById(id)) {
            CodeOfViolation codeOfViolation = codeOfViolationRepository.findById(id).get();
            codeOfViolation.setGroupName(codeOfViolationDTO.getGroupName());
            codeOfViolation.setClouse(codeOfViolationDTO.getClouse());
            codeOfViolation.setDescription(codeOfViolationDTO.getDescription());
            codeOfViolation.setCompanyId(codeOfViolationDTO.getCompanyId());
            codeOfViolation.setActionTaken(codeOfViolationDTO.getActionTaken());
            codeOfViolation.setYearId(codeOfViolationDTO.getYearId());
            codeOfViolation.setUpdatedBy(codeOfViolationDTO.getUpdatedBy());
            codeOfViolation.setUpdatedDate(codeOfViolationDTO.getUpdatedDate());
            codeOfViolation.setCreatedBy(codeOfViolationDTO.getCreatedBy());
            codeOfViolation.setCreatedDate(codeOfViolationDTO.getCreatedDate());
            codeOfViolation.setStatus(codeOfViolation.getStatus());
            return codeOfViolationRepository.save(codeOfViolation);
        } else {
            return null;
        }


    }


}
