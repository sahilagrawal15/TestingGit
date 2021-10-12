package com.jwtexample.JavaTechie.repository;

import com.jwtexample.JavaTechie.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserName(String username);

}
