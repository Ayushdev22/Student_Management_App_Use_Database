package com.jpahibernate.example.student_management_app.Controller;

import com.jpahibernate.example.student_management_app.Model.Student;
import com.jpahibernate.example.student_management_app.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/students/apis")
public class StudentController {

    @Autowired
    private StudentService studentService ;

    @PostMapping("/save")
    public String saveStudent(@RequestBody Student student){
        String response = studentService.addStudent(student);
        return response;
    }
}
