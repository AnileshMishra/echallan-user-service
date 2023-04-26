package com.echallan.user.model;
import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "ech_mst_role_privileges")
public class EchMstRolePrivileges {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "role_id")
    private Integer roleId;

    @NotNull
    @Column(name = "privilege_id")
    private Integer privilegeId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(Integer privilegeId) {
        this.privilegeId = privilegeId;
    }
}
