package com.onni.projekti.service;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onni.projekti.data.Data;

@Service
public class StudentService {
    
    @Autowired
    DataFile fileService;
    private List<Data> students = new ArrayList<>();
    /* 
    public StudentService(){
        try {
            students = fileService.readStudentsFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    */
    
    public void addStudent(Data student) throws Exception {
        students.add(student);
    }

    public List<Data> getStudents(){
        return new ArrayList<>(students);
    }
}
