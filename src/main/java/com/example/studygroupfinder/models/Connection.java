package com.example.studygroupfinder.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "connections")
public class Connection {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int connectionId;
    @JoinColumn(name="user_1")
    private User user1;
    @JoinColumn(name="user_2")
    private User user2;
    @Pattern(
            regexp = "requested|connected|removed",
            message = "Status must be requested, connected, or removed"
    )
    private String status;
    @Temporal(TemporalType.DATE)
    private Date connectedOn;
}
