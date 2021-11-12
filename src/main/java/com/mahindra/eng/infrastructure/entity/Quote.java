package com.mahindra.eng.infrastructure.entity;

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
@Table(name="eng_quote")
public class Quote implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String quote;
    private String lastDate;
    private String createdBy;
    @CreatedDate
    private Date createdDate;
    private String updatedBy;
    @LastModifiedDate
    private Date updatedDate;
    private String status;
}
