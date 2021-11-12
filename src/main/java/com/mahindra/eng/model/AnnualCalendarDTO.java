package com.mahindra.eng.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder
@Data
public class AnnualCalendarDTO {
    private int yearId;
    private Long id;
    private String mediaPath;
    private int companyId;
    private String createdBy;

    private Date createdDate;
    private String updatedBy;

    private Date updatedDate;
    private String status;
}
