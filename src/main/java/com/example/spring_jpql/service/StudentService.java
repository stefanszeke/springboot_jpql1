package com.example.spring_jpql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.spring_jpql.dto.StudentRequest;
import com.example.spring_jpql.entity.Student;
import com.example.spring_jpql.repository.StudentRepository;

@Service
public class StudentService {
    
    @Autowired
    private StudentRepository studentRepository;

    //get all
    // public List<Student> getStudents() {
    //     return studentRepository.getAllStudentsJPQL();
    // }
    public List<Student> getStudents() {
        return studentRepository.getAllStudentsJPQL();
    }

    //get by first name
    public List<Student> getStudentsByFirstName(String firstName) {
        return studentRepository.getStudentsByFirstNameJPQL(firstName);
    }

    //get by id
    public Student getStudentById(Long id) {
        return studentRepository.getStudentByIdJPQL(id);
    }

    //post
    public Student saveStudent(StudentRequest studentRequest) {
        Student student = new Student();
        student.setFirstName(studentRequest.getFirstName());
        student.setLastName(studentRequest.getLastName());
        student.setEmail(studentRequest.getEmail());
        return studentRepository.save(student);
    }

    //delete by id
    public void deleteStudentById(Long id) {
        studentRepository.deleteStudentByIdJPQL(id);
    }

}
