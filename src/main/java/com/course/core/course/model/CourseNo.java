package com.course.core.course.model;

import java.util.UUID;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(of = "no")
public class CourseNo {

    private String no;

    public CourseNo() {
        this.no = UUID.randomUUID().toString();
    }

}
