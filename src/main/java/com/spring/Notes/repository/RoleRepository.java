package com.spring.Notes.repository;


import com.spring.Notes.models.AppRole;
import com.spring.Notes.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(AppRole appRole);

}

