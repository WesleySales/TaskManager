package com.justdoit.tasks.DTOs;

import com.justdoit.tasks.entities.TaskDifficulty;

import java.time.LocalDate;

public record TaskDTO(
        String title,
        String description,
        LocalDate dateExp,
        TaskDifficulty difficulty
) {
}
