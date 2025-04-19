package com.iit.schoolsys;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/web")
public class StudentWebController {

    @Autowired
    StudentService studentService;

    @RequestMapping("/home")
    public String home(Model model) {
        model.addAttribute("message", "This is a Message");
        return "home";
    }

    @RequestMapping("/students")
    public String getStudents(Model model) {
        model.addAttribute("students", studentService.getStudentList());
        return "students";
    }

}
