package com.justdoit.tasks.repositories;

import com.justdoit.tasks.User.User;
import com.justdoit.tasks.User.UserRole;
import com.justdoit.tasks.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByName(String name);
    User findByRole(UserRole role);

}
