package com.justdoit.tasks.services;

import com.justdoit.tasks.DTOs.TaskDTO;
import com.justdoit.tasks.DTOs.UserDTO;
import com.justdoit.tasks.User.User;
import com.justdoit.tasks.entities.Task;
import com.justdoit.tasks.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser (UserDTO data){
            User newUser = new User(data);
            userRepository.save(newUser);
            return newUser;
    }

    public User updateUser (Long id,UserDTO data){
        User user = getById(id);
        user.setName(data.name());
        user.setRole(data.role());
        userRepository.save(user);
        return user;
    }

    public void deleteTask (Long id){
        User user = getById(id);
        userRepository.delete(user);
    }


    public List<User> getAll(){
        List<User> list = userRepository.findAll();
        return list;
    }

    public User getById(Long id){
        User byId = userRepository.findById(id).get();
        return byId;
    }
}
