package com.mahindra.eng.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder
@Data
public class CountryDTO {
    private Long id;
    private String name;
    private String code;
    private String createdBy;
    private Date createdDate;
    private String updatedBy;
    private Date updatedDate;
    private String status;
}
