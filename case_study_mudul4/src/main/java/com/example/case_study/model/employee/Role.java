package com.example.case_study.model.employee;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Role {
    @Id
    private Integer roleId;
    private String name;
    @OneToMany
    private List<UseRole> useRole;

    public Role() {
    }

    public Role(Integer roleId, String name, List<UseRole> useRole) {
        this.roleId = roleId;
        this.name = name;
        this.useRole = useRole;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<UseRole> getUseRole() {
        return useRole;
    }

    public void setUseRole(List<UseRole> useRole) {
        this.useRole = useRole;
    }
}
