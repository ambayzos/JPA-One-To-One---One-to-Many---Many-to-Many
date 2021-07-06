package com.belajar.jpa.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.belajar.jpa.entity.Comments;

public interface CommentsRepository extends JpaRepository<Comments, Long> {

}
