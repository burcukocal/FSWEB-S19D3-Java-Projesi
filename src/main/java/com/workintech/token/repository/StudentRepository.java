package com.workintech.token.repository;

import com.workintech.token.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;
public interface StudentRepository extends JpaRepository<Student, Integer> {

    @Query("SELECT s FROM Student s WHERE s.tckn = :tckn")
    Optional<Student> findStudentByTckn(String tckn);
}
