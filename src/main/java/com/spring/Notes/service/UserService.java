package com.spring.Notes.service;



import com.spring.Notes.dtos.UserDTO;
import com.spring.Notes.models.Role;
import com.spring.Notes.models.User;
import com.warrenstrange.googleauth.GoogleAuthenticatorKey;

import java.util.List;
import java.util.Optional;

public interface UserService {
    void updateUserRole(Long userId, String roleName);

    List<User> getAllUsers();

    UserDTO getUserById(Long id);

    User findByUsername(String username);

    void updatePassword(Long userId, String password);

    void updateAccountLockStatus(Long userId, boolean lock);

    void updateAccountExpiryStatus(Long userId, boolean expire);

    void updateAccountEnabledStatus(Long userId, boolean enabled);

    void updateCredentialsExpiryStatus(Long userId, boolean expire);

    List<Role> getAllRoles();

    void generatePasswordResetToken(String email);

    Optional<User> findByEmail(String email);

    User registerUser(User newUser);

    void resetPassword(String token, String newPassword);

    GoogleAuthenticatorKey generate2FASecret(Long userId);

    boolean validate2FACode(Long userId, int code);

    void enable2FA(Long userId);

    void disable2FA(Long userId);
}
