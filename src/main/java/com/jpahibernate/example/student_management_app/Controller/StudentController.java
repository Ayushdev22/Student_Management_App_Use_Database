package com.jpahibernate.example.student_management_app.Controller;

import com.jpahibernate.example.student_management_app.Model.Student;
import com.jpahibernate.example.student_management_app.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


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
    @GetMapping("/findById/{id}")
    public Student getStudentById(@PathVariable int id){
      Student student = studentService.findByStudentId(id);
      return student;
    }
    @GetMapping("/findAll")
    public List<Student> findByAllStudents(){
       List<Student> student = studentService.findAllStudent();
       return student;
    }
    @DeleteMapping("/delete/{id}")
    public String studentDeleteById(@PathVariable int id){
        String response = studentService.deleteStudentById(id);
        return response ;
    }
    @PutMapping("/update/{id}")
    public String StudentUpdateByPut(@PathVariable int id ,@RequestBody Student newStudent){
        String response = studentService.updateStudentUsingPut(id ,newStudent);
        return response;
    }
    @PutMapping("/updateEmail/{id}")
    public String StudentUpdateByPatch(@PathVariable int id ,@RequestParam String newEmail){
        String response = studentService.updatestudentUsingPatch(id , newEmail);
        return response;
    }


}
