package spring_security.demo.entities;

import lombok.*;

import java.util.Arrays;
import java.util.List;

@Getter
@Setter
public class StudentEntity {
    private final Integer studentId;
    private final String studentName;


    public StudentEntity(Integer studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }
}
