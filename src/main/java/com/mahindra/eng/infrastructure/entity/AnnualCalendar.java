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
@Table(name="eng_annual_calendar")
public class AnnualCalendar implements Serializable {
    public AnnualCalendar(){}
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int yearId;
    private String mediaPath;
    private int companyId;
    private String createdBy;
    @CreatedDate
    private Date createdDate;
    private String updatedBy;
    @LastModifiedDate
    private Date updatedDate;
    private String status;
}
