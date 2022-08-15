package com.manytomany.many2many.teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    TeacherRepository teacherRepository;

    @GetMapping
    List<Teacher> getTeachers(){
        return teacherRepository.findAll();
    }

    @PostMapping
    Teacher saveTeacher(@RequestBody Teacher teacher){
        return teacherRepository.save(teacher);
    }
}
