package com.mahindra.eng.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder
@Data
public class EthicsCounselorDTO {
    private Long id;
    private Long locationId;
    private int employeeId;
    private Long companyId;
    private String type;
    private String createdBy;
    private Date createdDate;
    private String updatedBy;
    private Date updatedDate;
    private String status;



}
