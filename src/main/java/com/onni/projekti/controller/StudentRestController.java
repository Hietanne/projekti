package com.onni.projekti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.onni.projekti.data.Data;
import com.onni.projekti.service.StudentService;

@RestController
public class StudentRestController {
    
    @Autowired
    StudentService myStudentService;

    @GetMapping("students")
    public List<Data> getStudents() {
        return myStudentService.getStudents();
    }

    @PostMapping("addstudent")
    public String addStudent(@RequestBody Data student) throws Exception{
        myStudentService.addStudent(student);
        return "";
    }

    @PostMapping("addstudentinfo")
    public String addStudentInfo(@RequestParam String fname, @RequestParam String lname, @RequestParam int ID) throws Exception{
        myStudentService.addStudent(new Data(fname,lname,ID));
        return "";
    }
}
