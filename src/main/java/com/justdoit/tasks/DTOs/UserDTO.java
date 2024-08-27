package com.justdoit.tasks.DTOs;

import com.justdoit.tasks.User.UserRole;

import java.time.LocalDate;

public record UserDTO(
        String name,
        UserRole role
) {
}
