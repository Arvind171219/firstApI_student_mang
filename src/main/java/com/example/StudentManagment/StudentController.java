package com.example.StudentManagment;
import java.util.*;

import org.springframework.web.bind.annotation.*;

import javax.management.remote.SubjectDelegationPermission;
import java.util.HashMap;

@RestController
public class StudentController {
    Map<Integer,Student> db = new HashMap<>();
    @PostMapping("/add_student")
    public String addStudent(@RequestBody Student student){
        int admnNo=student.getAdmnNo();
        db.put(admnNo,student);
        return "Student Added succesfully";
    }
    @GetMapping("/get_student")
    public Student getStudent(@RequestParam("q") int admnNo){
        return db.get(admnNo);
    }
}
