package com.justdoit.tasks.services;

import com.justdoit.tasks.DTOs.TaskDTO;
import com.justdoit.tasks.entities.Task;
import com.justdoit.tasks.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository repository;

    public Task createTask (TaskDTO data){
        Task newTask = new Task(data);
        repository.save(newTask);
        return newTask;
    }

    public Task updateTask (Long id,TaskDTO data){
        Task task = getById(id);
        task.setTitle(data.title());
        task.setDescription(data.description());
        task.setDificulty(data.difficulty());
        task.setDateExpiration(data.dateExp());
        repository.save(task);
        return task;
    }

    public void deleteTask (Long id){
        Task task = getById(id);
        repository.delete(task);
    }


    public List<Task> getAll(){
        List<Task> list = repository.findAll();
        return list;
    }

    public Task getById(Long id){
        Task byId = repository.findById(id).get();
        return byId;
    }
}
