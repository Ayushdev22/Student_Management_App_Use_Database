package com.jpahibernate.example.student_management_app.Service;

import com.jpahibernate.example.student_management_app.Model.Student;
import com.jpahibernate.example.student_management_app.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // it is a service class and it contains the business logic
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public String addStudent(Student student){
        studentRepository.save(student);
        return "Student add sucessfully";
    }
}
