package com.mahindra.eng.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder
@Data
public class EthicsPolicyDTO {
    private Long id;
    private String name;
    private String description;
    private String objective;
    private String eligibility;
    private String limits;
    private String generalGuideline;
    private Long companyId;
    private String createdBy;
    private Date createdDate;
    private String updatedBy;
    private Date updatedDate;
    private String status;


}
