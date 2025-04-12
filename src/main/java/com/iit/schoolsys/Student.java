package com.iit.schoolsys;

import jakarta.persistence.*;
import lombok.Data;

@Data

@Entity
@Table(name="student_info")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long studentId;
    private String name;
    private String email;
    private String address;


//    public Student(Long studentId, String name, String email, String address) {
//        this.studentId = studentId;
//        this.name = name;
//        this.email = email;
//        this.address = address;
//    }
//
//    public Student() {}


    // new
}
