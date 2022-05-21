package com.course.core.student.model;

import java.util.UUID;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(of = "no")
public class StudentNo {

    private String no;

    public StudentNo() {
        this.no = UUID.randomUUID().toString();
    }

}
