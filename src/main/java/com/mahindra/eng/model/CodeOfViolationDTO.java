package com.mahindra.eng.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;


@Builder
@Data
public class CodeOfViolationDTO {
    private Long id;
    private String groupName;
    private String description;
    private String clouse;
    private String actionTaken;

    private int yearId;

    private int companyId;
    private String createdBy;

    private Date createdDate;
    private String updatedBy;

    private Date updatedDate;
    private String status;
}
