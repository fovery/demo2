package com.example.demo.entity;

import java.util.List;

public class SysUser     {
    private String username;
    private String password;
    private Integer id;
    private List<Sysrole> roles;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Sysrole> getRoles() {
        return roles;
    }

    public void setRoles(List<Sysrole> roles) {
        this.roles = roles;
    }
}
