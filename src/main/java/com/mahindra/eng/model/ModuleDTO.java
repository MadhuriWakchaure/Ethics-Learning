package com.mahindra.eng.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder
@Data
public class ModuleDTO {
    private Long id;
    private String name;
    private String isInternal;
    private String internalLink;
    private String createdBy;
    private Date createdDate;
    private String updatedBy;
    private Date updatedDate;
    private String status;

}
