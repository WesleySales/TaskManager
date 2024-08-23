package com.justdoit.tasks.services;

import com.justdoit.tasks.DTOs.TaskDTO;
import com.justdoit.tasks.entities.Project;
import com.justdoit.tasks.entities.Task;
import com.justdoit.tasks.repositories.ProjectRepository;
import com.justdoit.tasks.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;
    @Autowired
    private ProjectRepository projectRepository;
    @Autowired
    private ProjectService projectService;

    public Task createTask (TaskDTO data){
        try {
            Project project = projectService.getById(data.projectID());
            if (project == null) {
                throw new RuntimeException("Projeto não encontrado");
            }
            Task newTask = new Task(data, project);
            taskRepository.save(newTask);
            return newTask;

        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException("Erro ao criar a tarefa", e);
        }
    }

    public Task updateTask (Long id,TaskDTO data){
        Task task = getById(id);
        task.setTitle(data.title());
        task.setDescription(data.description());
        task.setDificulty(data.difficulty());
        task.setDateExpiration(data.dateExp());
        taskRepository.save(task);
        return task;
    }

    public void deleteTask (Long id){
        Task task = getById(id);
        taskRepository.delete(task);
    }


    public List<Task> getAll(){
        List<Task> list = taskRepository.findAll();
        return list;
    }

    public Task getById(Long id){
        Task byId = taskRepository.findById(id).get();
        return byId;
    }
}
