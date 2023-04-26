package com.echallan.user.model;
import java.time.Instant;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "ech_mst_districts",
       indexes = @Index(name = "idx_name_ech_mst_districts",
                        columnList = "name,state_code,type,office_type"))
public class District {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(max = 255)
    private String name;

    @Column(name = "district_code")
    private Integer districtCode;

    @NotNull
    @Size(min = 2, max = 2)
    @Column(name="state_code")
    private String stateCode;

    private Integer type;

    @NotNull
    @Size(max = 255)
    private String authorityType;

    @NotNull
    @Size(max = 255)
    private String atc;

    @NotNull
    @Size(max = 255)
    private String dtc;

    @NotNull
    @Size(max = 255)
    private String address;

    @NotNull
    @Size(max = 255)
    @Column(name = "office_type")
    private String officeType;

    @Column(name = "is_active")
    private Integer isActive = 1;

    @Column(name = "created_at")
    private Instant createdAt = Instant.now();

    @Column(name = "updated_at")
    private Instant updatedAt = Instant.now();

    // getters and setters
}
