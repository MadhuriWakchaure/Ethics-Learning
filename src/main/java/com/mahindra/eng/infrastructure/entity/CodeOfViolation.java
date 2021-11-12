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
@AllArgsConstructor
@Data
@Table(name = "eng_code_of_violation")

public class CodeOfViolation implements Serializable {
    public CodeOfViolation(){}
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String groupName;
    private String description;
    private String clouse;
    private String actionTaken;
    //FK
    private int yearId;
    //FK
    private int companyId;
    private String createdBy;
    @CreatedDate
    private Date createdDate;
    private String updatedBy;
    @LastModifiedDate
    private Date updatedDate;
    private String status;



}
