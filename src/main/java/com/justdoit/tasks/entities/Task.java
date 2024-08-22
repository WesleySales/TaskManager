package com.justdoit.tasks.entities;

import com.justdoit.tasks.DTOs.TaskDTO;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private LocalDate dateCreated;
    private LocalDate dateExpiration;

    @Enumerated(EnumType.STRING)
    private TaskDifficulty dificulty ;

    public Task(TaskDTO data){
        this.title= data.title();
        this.description = data.description();
        this.dateCreated = LocalDate.now();
        this.dateExpiration = data.dateExp();
        this.dificulty = data.difficulty();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public LocalDate getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(LocalDate dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public TaskDifficulty getDificulty() {
        return dificulty;
    }

    public void setDificulty(TaskDifficulty dificulty) {
        this.dificulty = dificulty;
    }
}
