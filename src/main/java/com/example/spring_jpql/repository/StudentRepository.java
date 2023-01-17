package com.example.spring_jpql.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.spring_jpql.entity.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    
    @Query("FROM Student")
    List<Student> getAllStudentsJPQL();

    @Query("FROM Student WHERE firstName = :n")
    List<Student> getStudentsByFirstNameJPQL(@Param("n")String firstName);

    @Query("FROM Student WHERE id = :id")
    Student getStudentByIdJPQL(Long id);

    // delete by id query:
    @Query("DELETE FROM Student WHERE id = :id")
    void deleteStudentByIdJPQL(Long id);

}
