package com.justdoit.tasks.controllers;

import com.justdoit.tasks.DTOs.TaskDTO;
import com.justdoit.tasks.entities.Task;
import com.justdoit.tasks.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/tasks")
public class TaskController {

    @Autowired
    private TaskService service;

    @PostMapping
    public ResponseEntity<Task> postTask (@RequestBody TaskDTO data){
        Task newTask = service.createTask(data);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Task> updateTask (@PathVariable Long id, @RequestBody TaskDTO data){
        Task newTask  = service.updateTask(id,data);
        return ResponseEntity.ok().body(newTask);
    }

    @GetMapping
    public ResponseEntity findAll(){
        List<Task> list = service.getAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value="/{id}")
    public ResponseEntity findById( Long id){
        Task taskById = service.getById(id);
        return ResponseEntity.ok().body(taskById);
    }

    @DeleteMapping(value="/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id){
        service.deleteTask(id);
        return ResponseEntity.ok().build();
    }
}
