package com.ecosio.persistence;

import com.ecosio.model.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Student repository
 */
@EnableJpaRepositories
public interface StudentRepository extends JpaRepository<Student, Long> {



}
