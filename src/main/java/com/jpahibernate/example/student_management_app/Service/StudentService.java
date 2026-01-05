package com.jpahibernate.example.student_management_app.Service;

import com.jpahibernate.example.student_management_app.Model.Student;
import com.jpahibernate.example.student_management_app.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // it is a service class and it contains the business logic
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public String addStudent(Student student){
        studentRepository.save(student);
        return "Student add sucessfully";
    }

    public Student findByStudentId(int id){
       Optional<Student> studentOptional = studentRepository.findById(id);
        if(studentOptional.isPresent()){
            return studentOptional.get();
        }else{
           return null;
        }
    }

    public List<Student> findAllStudent(){
        List<Student> studentList = studentRepository.findAll();
        return studentList;
    }

    public String deleteStudentById(int id){
        studentRepository.deleteById(id);
        return +id+ "student is deleted";
    }

    public String updateStudentUsingPut(int id ,Student newStudentRequest){
        //find student by id
        //if student is present update it
        //else we cannot update

        Student existStudent = findByStudentId(id);
        if(existStudent != null){
            studentRepository.save(newStudentRequest);
            return "Student update successfully";
        }
        else{
            return "student not found to update";
        }
    }

    public String  updatestudentUsingPatch(int id ,String newEmail){
        Student existStudent = findByStudentId(id);
        if(existStudent != null){
            existStudent.setEmail(newEmail);
            studentRepository.save(existStudent);
            return"student update successfully";
        }
        else{
            return "student not found";
        }
    }
}
