package com.mahindra.eng.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder
@Data
public class YearDTO {
    private int id;
    private int year;
    private String createdBy;
    private Date createdDate;
    private String updatedBy;
    private Date updatedDate;
    private String status;
}
