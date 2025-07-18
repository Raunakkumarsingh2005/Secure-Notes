package com.spring.Notes.repository;


import com.spring.Notes.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUserName(String username);

    boolean existsByUserName(String userName);

    Boolean existsByEmail(String email);

    Optional<User> findByEmail(String email);
}