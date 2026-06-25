package com.example.studygroupfinder.models;


import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "groups")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int groupId;
    @NotBlank
    private String groupName;
    @NotBlank
    private String subject;
    @NotBlank
    private String description;
    @NotBlank
    private String passkey;
    @ManyToOne
    @JoinColumn(name = "created_by")
    private Member createdBy; // FK for member primary key
    @Temporal(TemporalType.DATE)
    private Date createdAt;
    @NotBlank
    private String status;

}
