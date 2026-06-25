package com.example.studygroupfinder.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.boot.jaxb.mapping.internal.TemporalTypeMarshalling;

import java.util.Date;

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
