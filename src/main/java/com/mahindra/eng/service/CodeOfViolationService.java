package com.mahindra.eng.service;

import com.mahindra.eng.infrastructure.entity.CodeOfViolation;
import com.mahindra.eng.model.CodeOfViolationDTO;

public interface CodeOfViolationService {

    public CodeOfViolation saveCodeOfViolation(CodeOfViolationDTO codeOfViolationDTO);
    public CodeOfViolation getCodeOfViolationList(Long id);
    public CodeOfViolation saveOrUpdate(Long id, CodeOfViolationDTO codeOfViolationDTO);


}
