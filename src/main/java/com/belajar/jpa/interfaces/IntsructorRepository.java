package com.belajar.jpa.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.belajar.jpa.entity.Instructor;

public interface IntsructorRepository extends JpaRepository<Instructor, Long> {

}
