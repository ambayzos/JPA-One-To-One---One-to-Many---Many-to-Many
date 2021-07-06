package com.belajar.jpa.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.belajar.jpa.entity.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
