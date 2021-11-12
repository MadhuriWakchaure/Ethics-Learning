package com.mahindra.eng.service;

import com.mahindra.eng.infrastructure.entity.EthicsPolicy;
import com.mahindra.eng.model.EthicsPolicyDTO;

import java.util.List;

public interface EthicsPolicyService {

    public List<EthicsPolicy> getEthicsPolicyList(Long id);
    public EthicsPolicy getEthicsPolicyById(Long id);
    public EthicsPolicy saveEthicsPolicy(EthicsPolicyDTO ethicsPolicyDTO);
    public EthicsPolicy saveOrUpdate(Long id, EthicsPolicyDTO ethicsPolicyDTO);

}
