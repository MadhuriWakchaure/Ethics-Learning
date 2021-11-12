package com.mahindra.eng.service.impl;

import com.mahindra.eng.infrastructure.entity.EthicsPolicy;
import com.mahindra.eng.infrastructure.repository.EthicsPolicyRepository;
import com.mahindra.eng.model.EthicsPolicyDTO;
import com.mahindra.eng.service.EthicsPolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EthicsPolicyServiceImpl implements EthicsPolicyService {
    private EthicsPolicyRepository ethicsPolicyRepository;

    @Autowired
    public void EthicsPolicyServiceImpl(EthicsPolicyRepository ethicsPolicyRepository) {
        this.ethicsPolicyRepository = ethicsPolicyRepository;
    }

    public List<EthicsPolicy> getEthicsPolicyList(Long id) {
        return ethicsPolicyRepository.findByCompanyId(id);
    }

    @Override
    public EthicsPolicy getEthicsPolicyById(Long id) {
        return ethicsPolicyRepository.findById(id).get();
    }

    @Override
    public EthicsPolicy saveEthicsPolicy(EthicsPolicyDTO ethicsPolicyDTO) {
        EthicsPolicy ethicsPolicy = EthicsPolicy.builder()
                .id(ethicsPolicyDTO.getId())
                .name(ethicsPolicyDTO.getName())
                .description(ethicsPolicyDTO.getDescription())
                .objective(ethicsPolicyDTO.getObjective())
                .eligibility(ethicsPolicyDTO.getEligibility())
                .limits(ethicsPolicyDTO.getLimits())
                .generalGuideline(ethicsPolicyDTO.getGeneralGuideline())
                .companyId(ethicsPolicyDTO.getCompanyId())
                .createdBy(ethicsPolicyDTO.getCreatedBy())
                .createdDate(ethicsPolicyDTO.getCreatedDate())
                .updatedBy(ethicsPolicyDTO.getUpdatedBy())
                .updatedDate(ethicsPolicyDTO.getUpdatedDate())
                .status(ethicsPolicyDTO.getStatus())
                .build();
        return ethicsPolicyRepository.save(ethicsPolicy);
    }

    @Override
    public EthicsPolicy saveOrUpdate(Long id, EthicsPolicyDTO ethicsPolicyDTO) {
        if (ethicsPolicyRepository.existsById(id)) {
            EthicsPolicy ethicsPolicy = ethicsPolicyRepository.findById(id).get();
            ethicsPolicy.setName(ethicsPolicyDTO.getName());
            ethicsPolicy.setDescription(ethicsPolicyDTO.getDescription());
            ethicsPolicy.setObjective(ethicsPolicyDTO.getObjective());
            ethicsPolicy.setEligibility(ethicsPolicyDTO.getEligibility());
            ethicsPolicy.setLimits(ethicsPolicyDTO.getLimits());
            ethicsPolicy.setGeneralGuideline(ethicsPolicyDTO.getGeneralGuideline());
            ethicsPolicy.setCompanyId(ethicsPolicyDTO.getCompanyId());
            ethicsPolicy.setCreatedBy(ethicsPolicyDTO.getCreatedBy());
            ethicsPolicy.setCreatedDate(ethicsPolicyDTO.getCreatedDate());
            ethicsPolicy.setUpdatedBy(ethicsPolicyDTO.getUpdatedBy());
            ethicsPolicy.setUpdatedDate(ethicsPolicyDTO.getUpdatedDate());
            ethicsPolicy.setStatus(ethicsPolicyDTO.getStatus());
            return ethicsPolicyRepository.save(ethicsPolicy);
        } else {
            return null;
        }
    }


}
