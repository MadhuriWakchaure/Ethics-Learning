package com.mahindra.eng.service;

import com.mahindra.eng.infrastructure.entity.Company;
import com.mahindra.eng.model.CompanyDTO;

public interface CompanyService {
    public Company saveCompany(CompanyDTO companyDTO);
    public Company getCompanyList(Long id);
    public Company saveOrUpdate(Long id, CompanyDTO companyDTO);

}
