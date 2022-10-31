package com.onni.projekti.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Service;

import com.onni.projekti.data.Data;

@Service
public class DataFile {


    public DataFile() {
    }


    public void writeFile(List<Data> student) throws Exception {
        FileWriter wr = new FileWriter( new File("students.txt"));
        for (Data data : student) {
            wr.write(data.getFirstName()+".");
            wr.write(data.getLastName()+".");
            wr.write(data.getClassID()+System.lineSeparator());
        }
        wr.close();
    }

    public List<Data> readStudentsFile() throws FileNotFoundException {
        Scanner sc = new Scanner( new File("students.txt"));
        List<Data> students = new ArrayList<>();
        while (sc.hasNextLine()) {
            String[] studentInfo = sc.nextLine().split(".");
            Data d = new Data(studentInfo[0],studentInfo[1],Integer.parseInt(studentInfo[2]));
            students.add(d);
        }
        sc.close();
        return students;
    }
}
