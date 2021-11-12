package com.mahindra.eng.service.impl;

import com.mahindra.eng.infrastructure.entity.Contant;
import com.mahindra.eng.infrastructure.repository.ContantRepository;
import com.mahindra.eng.model.ContantDTO;
import com.mahindra.eng.service.ContantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContantServiceImpl implements ContantService {
    private ContantRepository contantRepository;

    @Autowired
    public void ContantServiceImpl(ContantRepository contantRepository) {

        this.contantRepository = contantRepository;
    }

    public Contant saveContant(ContantDTO contantDTO) {
        Contant contant=Contant.builder()
                .id(contantDTO.getId())
                .countryId(contantDTO.getCountryId())
                .countryHelpline(contantDTO.getCountryHelpline())
                .companyId(contantDTO.getCompanyId())
                .createdBy(contantDTO.getCreatedBy())
                .createdDate(contantDTO.getCreatedDate())
                .updatedBy(contantDTO.getUpdatedBy())
                .updatedDate(contantDTO.getUpdatedDate())
                .status(contantDTO.getStatus())
                .build();
        return contantRepository.save(contant);
    }

    public Contant getContantList(Long id) {
        return contantRepository.findById(id).get();
    }

    public Contant saveOrUpdate(Long id, ContantDTO contantDTO) {
        if (contantRepository.existsById(id)) {
            Contant contant=contantRepository.findById(id).get();
            contant.setCountryId(contantDTO.getCountryId());
            contant.setCompanyId(contantDTO.getCompanyId());
            contant.setCountryHelpline(contantDTO.getCountryHelpline());
            contant.setCreatedBy(contantDTO.getCreatedBy());
            contant.setCreatedDate(contantDTO.getCreatedDate());
            contant.setUpdatedBy(contantDTO.getUpdatedBy());
            contant.setUpdatedDate(contantDTO.getUpdatedDate());
            contant.setStatus(contantDTO.getStatus());
            return contantRepository.save(contant);
        }
        else{
            return null;
        }
    }


}
