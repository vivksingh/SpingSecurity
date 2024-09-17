package com.example.springsecurity.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springsecurity.Modals.Users;

@Repository
public interface UserRepo extends JpaRepository<Users, Integer> {
    
    Users findByUsername(String username);
}
