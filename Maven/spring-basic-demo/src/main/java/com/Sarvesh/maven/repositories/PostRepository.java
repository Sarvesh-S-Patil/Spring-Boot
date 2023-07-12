package com.Sarvesh.maven.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Sarvesh.maven.entities.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
