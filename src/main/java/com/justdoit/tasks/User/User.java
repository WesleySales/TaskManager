package com.justdoit.tasks.User;

import com.justdoit.tasks.DTOs.UserDTO;
import com.justdoit.tasks.entities.Project;
import com.justdoit.tasks.entities.Task;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;

import java.util.Collection;
import java.util.List;

@Table(name = "Users")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class User {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Enumerated(EnumType.STRING)
    private UserRole role;

//    private Project project;
//    private List<Task> taskList;

    public User(UserDTO userDTO){
        this.id = id;
        this.name= userDTO.name();
        this.role= userDTO.role();
    }
}
