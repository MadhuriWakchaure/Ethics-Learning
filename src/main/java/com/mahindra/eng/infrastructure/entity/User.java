package com.mahindra.eng.infrastructure.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Builder
@Entity
@Data
@AllArgsConstructor
@Table(name = "eng_user")
public class User implements Serializable {

    public User() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String mobileNo;
    private String emailId;
    private String password;
    private String designation;
    private String unit;
    private int subUnit;
    private String sector;
    private String projectCode;
    private String projectManager;
    private int locationId;
    private int companyId;
    private int roleId;
    private String createdBy;
    @CreatedDate
    private Date createdDate;
    private String updatedBy;
    @LastModifiedDate
    private Date updatedDate;
    private String status;
}