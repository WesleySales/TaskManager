package com.justdoit.tasks.controllers;

import com.justdoit.tasks.DTOs.UserDTO;
import com.justdoit.tasks.User.User;
import com.justdoit.tasks.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="users")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping
    public ResponseEntity<User> postUser (@RequestBody UserDTO data){
        User newUser = service.createUser(data);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser (@PathVariable Long id, @RequestBody UserDTO data){
        User user  = service.updateUser(id,data);
        return ResponseEntity.ok().body(user);
    }

    @GetMapping
    public ResponseEntity findAll(){
        List<User> list = service.getAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value="/{id}")
    public ResponseEntity findById( Long id){
        User byId = service.getById(id);
        return ResponseEntity.ok().body(byId);
    }

    @DeleteMapping(value="/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id){
        service.deleteTask(id);
        return ResponseEntity.ok().build();
    }
}
