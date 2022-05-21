package com.course.core.course.model;

import com.course.core.student.model.StudentNo;
import java.time.LocalDateTime;

public class EnrollStudents {

    private StudentNo no;

    private LocalDateTime enrollDate;

    public EnrollStudents(StudentNo no) {
        this.no = no;
        this.enrollDate = LocalDateTime.now();
    }

}
