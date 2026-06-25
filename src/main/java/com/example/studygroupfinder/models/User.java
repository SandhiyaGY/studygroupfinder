package com.example.studygroupfinder.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    @NotBlank
    private String userName;
    @Email
    @NotBlank
    private String emailId;
    @NotBlank
    private String phoneNo;
    @Temporal(TemporalType.DATE)
    private Date joinedDate;
}
