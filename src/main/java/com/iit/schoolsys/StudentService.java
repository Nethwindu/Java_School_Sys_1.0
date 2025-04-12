package com.iit.schoolsys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepo repo;

    public Student addStudent(Student student) {
        return repo.save(student);
    }

    public Student updateStudent(Student student){
        return repo.save(student);
    }

    public void deleteStudent(Long id){
        repo.deleteById(id);
    }

    public List<Student> getStudentList(){
        return repo.findAll();
    }


}
