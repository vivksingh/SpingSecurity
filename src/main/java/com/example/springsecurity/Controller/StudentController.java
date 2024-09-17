package com.example.springsecurity.Controller;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springsecurity.Modals.Student;

import jakarta.servlet.http.HttpServletRequest;

import java.util.List;

@RestController
public class StudentController {

    List<Student> students = List.of(
        new Student(1, "James Bond", "A+"),
        new Student(2, "Maria Jones", "A"),
        new Student(3, "Anna Smith", "B")
    );

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student){
        students.add(student);
        return student;
    }

    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request){
        return (CsrfToken)request.getAttribute("_csrf");
    }
}
