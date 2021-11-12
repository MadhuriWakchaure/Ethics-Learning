package com.mahindra.eng.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder
@Data
public class MaterialDTO {
    private Long id;
    private String title;
    private String description;
    private String materialPath;
    private String mediaType;
    private String externalUrl;
    private String thumbnail;
    private String moduleType;
    private int companyId;
    private String createdBy;
    private Date createdDate;
    private String updatedBy;
    private Date updatedDate;
    private String status;


}
