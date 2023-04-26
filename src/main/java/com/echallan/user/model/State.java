package com.echallan.user.model;
import java.time.Instant;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "ech_mst_states")
public class State {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(max = 255)
    private String name;

    @NotNull
    @Size(max = 2)
    private String stateCode;

    @NotNull
    @Size(max = 255)
    private String stateName;

    @NotNull
    @Size(max = 20)
    private String egovCode;

    @Column(nullable = true)
    private Integer isActive = 1;

    @Column(nullable = false, updatable = false)
    private Instant createdAt = Instant.now();

    @Column(nullable = false)
    private Instant updatedAt = Instant.now();
    
    // Getters and setters
    
    // ...
    
}
