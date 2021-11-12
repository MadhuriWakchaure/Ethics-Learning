package com.mahindra.eng.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder
@Data
public class UserDTO {
    private Long id;
    private String name;
    private String username;
    private String password;
    private String emailId;
    private String mobileNo;
    private int locationId;
    private String designation;
    private String projectCode;
    private String projectManager;
    private String user;
    private String unit;
    private int subUnit;
    private String sector;
    private int roleId;
    private int companyId;
    private String createdBy;
    private Date createdDate;
    private String updatedBy;
    private Date updatedDate;
    private String status;



}
