package com.mahindra.eng.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder
@Data
public class CompanyDTO {
    private Long id;
    private String name;
    private String address;
    private String email;
    private String contact;
    private String helplineEmail;
    private String helplineContact;
    private String createdBy;
    private Date createdDate;
    private String updatedBy;
    private Date updatedDate;
    private String status;


}
