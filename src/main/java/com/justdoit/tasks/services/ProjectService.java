package com.justdoit.tasks.services;

import com.justdoit.tasks.DTOs.ProjectDTO;
import com.justdoit.tasks.entities.Project;
import com.justdoit.tasks.entities.Task;
import com.justdoit.tasks.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository repository;

    public Project createProject (ProjectDTO data){
        Project newProject = new Project(data);
        repository.save(newProject);
        return newProject;
    }


    public Project updateProject (Long id,ProjectDTO data){
        Project projectAtt = getById(id);
        projectAtt.setName(data.name());
        projectAtt.setDescription(data.description());
        projectAtt.setDateExpiration(data.dateExp());
        repository.save(projectAtt);
        return projectAtt;
    }

    public void deleteProject (Long id){
        Project project = getById(id);
        repository.delete(project);
    }


    public List<Project> getAll(){
        List<Project> list = repository.findAll();
        return list;
    }

    public Project getById(Long id){
        Project byId = repository.findById(id).get();
        return byId;
    }
}
