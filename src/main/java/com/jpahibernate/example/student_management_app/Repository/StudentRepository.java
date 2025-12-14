package com.jpahibernate.example.student_management_app.Repository;

import com.jpahibernate.example.student_management_app.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // it performs the database operation And it is the data layer
public interface StudentRepository extends JpaRepository<Student,Integer> {

}
