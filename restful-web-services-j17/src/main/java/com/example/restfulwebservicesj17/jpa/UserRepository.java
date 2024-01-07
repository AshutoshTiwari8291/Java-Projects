package com.example.restfulwebservicesj17.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restfulwebservicesj17.user.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
