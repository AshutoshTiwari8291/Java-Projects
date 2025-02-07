package com.example.restfulwebservicesj17.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restfulwebservicesj17.user.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {
	
}
