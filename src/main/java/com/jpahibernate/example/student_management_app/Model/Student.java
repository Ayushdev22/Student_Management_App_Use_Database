package com.jpahibernate.example.student_management_app.Model;

import jakarta.persistence.*;

@Entity // it represents that this class is entity or model class which is directly creating the database table ur schema
@Table(name="student")//it will create a table inside database
//@Data // it generate getter and setter
public class Student {
    @Id  // it is the primary key of the table - it is always unique and it is not null
    @Column(name ="id") //it will create a colum inside database table
    private Integer id;


    @Column(name ="student_name",nullable = false)//nullable = false - it cannot contain null value
    private String name ;

    @Column(name ="gender",nullable = false)
    private String gender;

    @Column(name="email",nullable = false,unique = true)  //unique = true - it cannot be duplicate
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
