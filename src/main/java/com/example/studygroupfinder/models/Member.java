package com.example.studygroupfinder.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="members")
public class Member {
    private int memberId;
    private Group groupId;
    private User userId;
    private Role roleId;
    private String status;
    private Date joinedOn;
}
