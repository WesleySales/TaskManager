package com.justdoit.tasks.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.justdoit.tasks.DTOs.ProjectDTO;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode (of = "id")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    @JsonIgnore
    @OneToMany(mappedBy = "project",cascade = CascadeType.REMOVE)
    private List<Task> tasksProject;

    private LocalDate dateCreated;
    private LocalDate dateExpiration;

    public Project (ProjectDTO data){
        this.name = data.name();
        this.description = data.description();
        this.dateCreated = LocalDate.now();
        this.dateExpiration = data.dateExp();
    }

}
