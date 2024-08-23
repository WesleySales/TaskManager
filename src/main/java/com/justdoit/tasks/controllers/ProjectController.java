package com.justdoit.tasks.controllers;

import com.justdoit.tasks.DTOs.ProjectDTO;
import com.justdoit.tasks.DTOs.TaskDTO;
import com.justdoit.tasks.entities.Project;
import com.justdoit.tasks.entities.Task;
import com.justdoit.tasks.services.ProjectService;
import com.justdoit.tasks.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/projects")
public class ProjectController {

    @Autowired
    private ProjectService service;

    @PostMapping
    public ResponseEntity<Project> postTask (@RequestBody ProjectDTO data){
        Project newProject = service.createProject(data);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Project> updateProject (@PathVariable Long id, @RequestBody ProjectDTO data){
        Project newProject  = service.updateProject(id,data);
        return ResponseEntity.ok().body(newProject);
    }

    @GetMapping
    public ResponseEntity findAll(){
        List<Project> list = service.getAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value="/{id}")
    public ResponseEntity findById( Long id){
        Project taskById = service.getById(id);
        return ResponseEntity.ok().body(taskById);
    }

    @DeleteMapping(value="/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id){
        service.deleteProject(id);
        return ResponseEntity.ok().build();
    }
}
