package com.mahindra.eng.service.impl;

import com.mahindra.eng.infrastructure.entity.Company;
import com.mahindra.eng.infrastructure.repository.CompanyRepository;
import com.mahindra.eng.model.CompanyDTO;
import com.mahindra.eng.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {
    private CompanyRepository companyRepository;

    @Autowired
    public void CompanyServiceImpl(CompanyRepository companyRepository) {

        this.companyRepository = companyRepository;}

    public Company saveCompany(CompanyDTO companyDTO) {
        Company company=Company.builder()
                .id(companyDTO.getId())
                .name(companyDTO.getName())
                .address(companyDTO.getAddress())
                .email(companyDTO.getEmail())
                .contact(companyDTO.getContact())
                .helplineEmail(companyDTO.getHelplineEmail())
                .helplineContact(companyDTO.getHelplineContact())
                .createdBy(companyDTO.getCreatedBy())
                .createdDate(companyDTO.getCreatedDate())
                .updatedBy(companyDTO.getUpdatedBy())
                .updatedDate(companyDTO.getUpdatedDate())
                .status(companyDTO.getStatus())
                .build();
        return companyRepository.save(company);

    }

    public Company getCompanyList(Long id) {
        return companyRepository.findById(id).get();

    }

    public Company saveOrUpdate(Long id, CompanyDTO companyDTO) {
        if (companyRepository.existsById(id)) {
            Company company = companyRepository.findById(id).get();
            company.setName(companyDTO.getName());
            company.setContact(companyDTO.getContact());
            company.setAddress(companyDTO.getAddress());
            company.setHelplineEmail(companyDTO.getHelplineEmail());
            company.setHelplineContact(companyDTO.getHelplineContact());
            company.setEmail(companyDTO.getEmail());
            company.setCreatedBy(companyDTO.getCreatedBy());
            company.setCreatedDate(companyDTO.getCreatedDate());
            company.setUpdatedBy(companyDTO.getUpdatedBy());
            company.setUpdatedBy(companyDTO.getUpdatedBy());
            company.setStatus(companyDTO.getStatus());
            return companyRepository.save(company);
        }
        else{
            return null;
        }

    }



}
