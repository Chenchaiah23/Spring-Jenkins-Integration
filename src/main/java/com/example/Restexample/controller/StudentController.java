package com.example.Restexample.controller;

import com.example.Restexample.dto.Student;
import com.example.Restexample.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    StudentRepository studentRepository;

    @Autowired
    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @RequestMapping("/fetchAll")
    public List<Student> fetchAll()
    {
        return studentRepository.findAll();
    }

    @RequestMapping(value="/add-student", method= RequestMethod.POST)
    public void addUser(@RequestBody Student s)
    {
        studentRepository.save(s);
    }
}
