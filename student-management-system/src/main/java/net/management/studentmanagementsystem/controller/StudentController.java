package net.management.studentmanagementsystem.controller;

import net.management.studentmanagementsystem.services.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService){
        super();
        this.studentService = studentService;
    }

//  handler method to handle list students and return mode and view
    @GetMapping("/students")
    public String listStudents(Model model){
        model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }



}
