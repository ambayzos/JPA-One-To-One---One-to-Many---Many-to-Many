package com.belajar.jpa.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.belajar.jpa.entity.Students;

public interface StudentsRepository extends CrudRepository<Students, Long> {

}
