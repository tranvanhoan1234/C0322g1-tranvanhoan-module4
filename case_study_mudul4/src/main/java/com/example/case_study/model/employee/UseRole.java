package com.example.case_study.model.employee;

import javax.persistence.*;

@Entity
public class UseRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    @ManyToOne
    @JoinColumn(name = "user_name", referencedColumnName = "userName")
    private User user;
    @ManyToOne
    @JoinColumn(name = "role_id", referencedColumnName = "roleId")
    private Role role;

    public UseRole() {
    }

    public UseRole(Integer id, User user, Role role) {
        Id = id;
        this.user = user;
        this.role = role;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
