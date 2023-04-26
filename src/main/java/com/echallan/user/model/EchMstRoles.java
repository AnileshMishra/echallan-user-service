package com.echallan.user.model;
import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "ech_mst_roles")
public class EchMstRoles {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long roleId;
    
    @NotBlank(message = "Name is required")
    @Size(max = 255, message = "Name must be up to 255 characters")
    @Column(nullable = false)
    private String name;
    
    @Column(name = "is_active")
    private Integer isActive = 1;
    
    @Column(name = "created_at", nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    
    @Column(name = "updated_at", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    
    // Getter and Setter methods
    
   
    
    public String getName() {
        return name;
    }
    
    public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public void setName(String name) {
        this.name = name;
    }
    
    public Integer getIsActive() {
        return isActive;
    }
    
    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }
    
    public Date getCreatedAt() {
        return createdAt;
    }
    
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    
    public Date getUpdatedAt() {
        return updatedAt;
    }
    
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
    
    // Constructor methods
    
    public EchMstRoles() {
        // Initialize createdAt and updatedAt to current timestamp
        this.createdAt = new Date();
        this.updatedAt = new Date();
    }
}
