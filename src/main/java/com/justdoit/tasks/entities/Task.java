package com.justdoit.tasks.entities;

import com.justdoit.tasks.DTOs.TaskDTO;
import com.justdoit.tasks.User.User;
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

    @ManyToOne
    @JoinColumn(name = "project_ID")
    private Project project;

    public Task(Project project,TaskDTO data){
        this.title= data.title();
        this.description = data.description();
        this.project = project;
        this.dateCreated = LocalDate.now();
        this.dateExpiration = data.dateExp();
        this.dificulty = data.difficulty();
    }


}
