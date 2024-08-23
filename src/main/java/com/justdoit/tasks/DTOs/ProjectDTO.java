package com.justdoit.tasks.DTOs;

import java.time.LocalDate;

public record ProjectDTO(
        String name,
        String description,
        LocalDate dateExp
) {
}
