package com.iit.schoolsys;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/web")
public class StudentWebController {

    @RequestMapping("/home")
    public String home(Model model) {
        model.addAttribute("message", "This is a Message");
        return "home";
    }

    @RequestMapping("/students")
    public String getStudents(Model model) {
        return "student.stu";
    }

}
