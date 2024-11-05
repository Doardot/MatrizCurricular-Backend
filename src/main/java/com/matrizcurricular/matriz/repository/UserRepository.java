package com.matrizcurricular.matriz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matrizcurricular.matriz.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
