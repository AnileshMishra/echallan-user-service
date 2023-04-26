package com.echallan.user.model;
import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "ech_target_challans")
public class TargetChallans {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "user_id")
    private Integer userId;

    @NotNull
    @Column(name = "district_id")
    private Integer districtId;

    @NotNull
    @Column(name = "area_circle_id")
    private Integer areaCircleId;

    @NotNull
    @Column(name = "challan_target")
    private Integer challanTarget;

    @NotNull
    @Column(name = "impound_target")
    private Integer impoundTarget;

    @NotNull
    @Column(name = "assigned_by")
    private Integer assignedBy;

    @NotNull
    @Column(name = "start_date")
    private LocalDateTime startDate;

    @NotNull
    @Column(name = "end_date")
    private LocalDateTime endDate;

    @Column(name = "is_active")
    private Integer isActive = 1;

    @NotNull
    @Column(name = "created_at")
    private LocalDateTime createdAt = LocalDateTime.now();

    @NotNull
    @Column(name = "updated_at")
    private LocalDateTime updatedAt = LocalDateTime.now();

    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = LocalDateTime.now();
    }

    // getters and setters

    // toString method
}
