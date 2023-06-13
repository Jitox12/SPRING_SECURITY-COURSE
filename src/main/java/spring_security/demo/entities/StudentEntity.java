package spring_security.demo.entities;

import lombok.*;

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
