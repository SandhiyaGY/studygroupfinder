package com.example.studygroupfinder.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="messages")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int messaeId;
    @JoinColumn(name="group_id")
    private Group groupId;
    @JoinColumn(name="sender_id")
    private Member senderId;
    private String messageText;
    @Temporal(TemporalType.DATE)
    private Date sentAt;
    @Temporal(TemporalType.DATE)
    private Date editedAt;
}
