package com.mahindra.eng.service.impl;

import com.mahindra.eng.infrastructure.entity.AnnualCalendar;
import com.mahindra.eng.infrastructure.repository.AnnualCalendarRepository;
import com.mahindra.eng.model.AnnualCalendarDTO;
import com.mahindra.eng.service.AnnualCalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnnualCalendarServiceImpl implements AnnualCalendarService {
    private AnnualCalendarRepository annualCalendarRepository;

    @Autowired
    public void AnnualCalendarServiceImpl(AnnualCalendarRepository annualCalendarRepository) {

        this.annualCalendarRepository = annualCalendarRepository;}
@Override
    public AnnualCalendar saveAnnualCalendar(AnnualCalendarDTO annualCalendarDTO) {
        AnnualCalendar annualCalendar=AnnualCalendar.builder()
                .id(annualCalendarDTO.getId())
                .yearId(annualCalendarDTO.getYearId())
                .mediaPath(annualCalendarDTO.getMediaPath())
                .companyId(annualCalendarDTO.getCompanyId())
                .createdBy(annualCalendarDTO.getCreatedBy())
                .createdDate(annualCalendarDTO.getCreatedDate())
                .updatedBy(annualCalendarDTO.getUpdatedBy())
                .updatedDate(annualCalendarDTO.getUpdatedDate())
                .status(annualCalendarDTO.getStatus())
                .build();
        return annualCalendarRepository.save(annualCalendar);
    }

    public AnnualCalendar getAnnualCalendarList(Long id) {
        return annualCalendarRepository.findById(id).get();
    }

    public AnnualCalendar saveOrUpdate(Long id, AnnualCalendarDTO annualCalendarDTO) {
        if (annualCalendarRepository.existsById(id)) {
            AnnualCalendar annualCalendar=annualCalendarRepository.findById(id).get();
            annualCalendar.setYearId(annualCalendarDTO.getYearId());
            annualCalendar.setMediaPath(annualCalendarDTO.getMediaPath());
            annualCalendar.setCompanyId(annualCalendarDTO.getCompanyId());
            annualCalendar.setCreatedBy(annualCalendar.getCreatedBy());
            annualCalendar.setCreatedDate(annualCalendarDTO.getCreatedDate());
            annualCalendar.setUpdatedBy(annualCalendarDTO.getUpdatedBy());
            annualCalendar.setUpdatedDate(annualCalendarDTO.getUpdatedDate());
            annualCalendar.setStatus(annualCalendarDTO.getStatus());
            return annualCalendarRepository.save(annualCalendar);
        }
        else{
            return null;
        }
    }


}
