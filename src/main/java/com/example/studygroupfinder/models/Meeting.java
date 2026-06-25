package com.example.studygroupfinder.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="meetings")
public class Meeting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int meetingId;
    @JoinColumn(name = "group_id")
    private Group groupId;
    @JoinColumn(name = "host_id")
    private Member hostId;
    @NotBlank
    private String meetingUrl;
    @NotBlank
    private String agenda;
    @Temporal(TemporalType.DATE)
    private Date startsOn;
    @Temporal(TemporalType.DATE)
    private Date endsOn;
    @Temporal(TemporalType.DATE)
    private Date expiresOn;
}
