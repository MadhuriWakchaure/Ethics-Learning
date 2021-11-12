package com.mahindra.eng.service.impl;

import com.mahindra.eng.infrastructure.entity.EthicsCounselor;
import com.mahindra.eng.infrastructure.repository.EthicsCounselorRepository;
import com.mahindra.eng.model.EthicsCounselorDTO;
import com.mahindra.eng.service.EthicsCounselorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EthicsCounselorImpl implements EthicsCounselorService {
    private EthicsCounselorRepository ethicsCounselorRepository;

    @Autowired
    public void EthicsCounselorImpl(EthicsCounselorRepository ethicsCounselorRepository) {
        this.ethicsCounselorRepository = ethicsCounselorRepository;
    }

    public EthicsCounselor getEthicsCounselorList(Long id) {
        return ethicsCounselorRepository.findById(id).get();
    }

    @Override
    public List<EthicsCounselor> getEthicsCounselorListById(Long id) {
        return ethicsCounselorRepository.findByLocationId(id);
    }

    @Override
    public List<EthicsCounselor> getEthicsCounselorListByCompanyId(Long id) {
        return ethicsCounselorRepository.findByCompanyId(id);
    }

    public EthicsCounselor saveEthicsCounselor(EthicsCounselorDTO ethicsCounselorDTO) {
        EthicsCounselor ethicsCounselor = EthicsCounselor.builder()
                .id(ethicsCounselorDTO.getId())
                .locationId(ethicsCounselorDTO.getLocationId())
                .companyId(ethicsCounselorDTO.getCompanyId())
                .employeeId(ethicsCounselorDTO.getEmployeeId())
                .type(ethicsCounselorDTO.getType())
                .createdBy(ethicsCounselorDTO.getCreatedBy())
                .createdDate(ethicsCounselorDTO.getCreatedDate())
                .updatedBy(ethicsCounselorDTO.getUpdatedBy())
                .updatedDate(ethicsCounselorDTO.getUpdatedDate())
                .status(ethicsCounselorDTO.getStatus())
                .build();
        return ethicsCounselorRepository.save(ethicsCounselor);
    }

    public EthicsCounselor saveOrUpdate(Long id, EthicsCounselorDTO ethicsCounselorDTO) {
        if (ethicsCounselorRepository.existsById(id)) {
            EthicsCounselor ethicsCounselor = ethicsCounselorRepository.findById(id).get();
            ethicsCounselor.setCompanyId(ethicsCounselorDTO.getCompanyId());
            ethicsCounselor.setLocationId(ethicsCounselorDTO.getLocationId());
            ethicsCounselor.setEmployeeId(ethicsCounselorDTO.getEmployeeId());
            ethicsCounselor.setType(ethicsCounselorDTO.getType());
            ethicsCounselor.setCreatedBy(ethicsCounselorDTO.getCreatedBy());
            ethicsCounselor.setCreatedDate(ethicsCounselorDTO.getCreatedDate());
            ethicsCounselor.setUpdatedBy(ethicsCounselorDTO.getUpdatedBy());
            ethicsCounselor.setUpdatedDate(ethicsCounselorDTO.getUpdatedDate());
            ethicsCounselor.setStatus(ethicsCounselorDTO.getStatus());
            return ethicsCounselorRepository.save(ethicsCounselor);
        } else {
            return null;
        }
    }


}
