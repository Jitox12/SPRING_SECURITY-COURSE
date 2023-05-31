package spring_security.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring_security.demo.entities.StudentEntity;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {
    private static final List<StudentEntity> STUDENTS = Arrays.asList(
            new StudentEntity(1, "James Bond"),
            new StudentEntity(2, "Maria Jones"),
            new StudentEntity(3, "Anna Smith")
    );

    @GetMapping(value = "/{studentId}")
    public StudentEntity getStudent(@PathVariable Integer studentId) {
        return STUDENTS.stream()
                .filter(student -> studentId.equals(student.getStudentId()))
                .findFirst()
                .orElseThrow(()-> new IllegalArgumentException("Student "+ studentId + "does not exist"));
    }
}
