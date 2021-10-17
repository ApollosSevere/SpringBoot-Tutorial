package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public List<Student> getStudents() {
        return List.of(new Student(1L, "Mariam", "severe@gmai.com", LocalDate.of(2000, Month.MARCH, 5), 21));
    }

}
