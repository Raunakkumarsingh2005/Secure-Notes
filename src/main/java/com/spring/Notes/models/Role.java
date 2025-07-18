package com.spring.Notes.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@Data
@Table(name = "roles")
public class Role{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Integer roleId;

    @ToString.Exclude
    @Enumerated(EnumType.STRING)
    @Column(length = 20, name = "role_name")
    private AppRole roleName;

    @OneToMany(mappedBy = "role", fetch = FetchType.LAZY, cascade = {CascadeType.MERGE})
    @JsonBackReference
    @ToString.Exclude
    private Set<User> users = new HashSet<>();

    public Role(AppRole roleName) {
        this.roleName = roleName;
    }

    public Role() {
    }

    public Integer getRoleId() {
        return roleId;
    }

    public Role setRoleId(Integer roleId) {
        this.roleId = roleId;
        return this;
    }

    public AppRole getRoleName() {
        return roleName;
    }

    public Role setRoleName(AppRole roleName) {
        this.roleName = roleName;
        return this;
    }

    public Set<User> getUsers() {
        return users;
    }

    public Role setUsers(Set<User> users) {
        this.users = users;
        return this;
    }
}


