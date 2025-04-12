package com.iit.schoolsys;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/school")
public class StudentAPIController {

    @Autowired
    StudentService studentService;

    @RequestMapping("/info")
    public String info(){
        return "Spring Boot Student API..";
    }

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
        Student student1 = studentService.addStudent(student);
        return "Student Added Successfully | Student Id : " + student1.getStudentId();
    }

    @RequestMapping("/list")
    public List<Student> getStudentList(){
        return studentService.getStudentList();
    }

    @RequestMapping("/list/{id}")
    public List<Student> getStudentById(@PathVariable Long id) {
        return studentService.getStudentList();
    }


}
