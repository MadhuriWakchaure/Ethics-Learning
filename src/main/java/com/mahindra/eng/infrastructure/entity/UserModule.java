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
@Table(name="user_module")
public class UserModule implements Serializable {
    public UserModule(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Long userId;
    private int moduleId;
    private String type;
    private String createdBy;
    @CreatedDate
    private Date createdDate;
    private String updatedBy;
    @LastModifiedDate
    private Date updatedDate;
    private String status;
}
