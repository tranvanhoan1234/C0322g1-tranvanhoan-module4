package com.example.case_study.model.employee;

import com.example.case_study.model.customer.Customer;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class User {
    @Id
    private String userName;
    private String password;
    @OneToMany(mappedBy = "user")
    List<Employee> employeeList;
    @OneToMany(mappedBy = "role")
    List<UseRole> useRoleList;

    public User() {
    }

    public User(String userName, String password, List<Employee> employeeList, List<UseRole> useRoleList) {
        this.userName = userName;
        this.password = password;
        this.employeeList = employeeList;
        this.useRoleList = useRoleList;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<UseRole> getUseRoleList() {
        return useRoleList;
    }

    public void setUseRoleList(List<UseRole> useRoleList) {
        this.useRoleList = useRoleList;
    }
}
