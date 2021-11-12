package com.mahindra.eng.service;

import com.mahindra.eng.infrastructure.entity.EthicsCounselor;
import com.mahindra.eng.model.EthicsCounselorDTO;

import java.util.List;

public interface EthicsCounselorService {

    public EthicsCounselor getEthicsCounselorList(Long id);
    public List<EthicsCounselor> getEthicsCounselorListById(Long id);
    public List<EthicsCounselor> getEthicsCounselorListByCompanyId(Long id);
    public EthicsCounselor saveEthicsCounselor(EthicsCounselorDTO ethicsCounselorDTO);
    public EthicsCounselor saveOrUpdate(Long id, EthicsCounselorDTO ethicsCounselorDTO);

}
