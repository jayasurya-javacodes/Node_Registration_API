package com.example.noderegistration.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "nodes")
public class Node {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String nodeName;

    @Column(nullable = false, unique = true)
    private String ipAddress;

    private String status;

    private LocalDateTime createdAt;
}
