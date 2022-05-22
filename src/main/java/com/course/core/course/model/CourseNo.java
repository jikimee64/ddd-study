package com.course.core.course.model;

import java.io.Serializable;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.EqualsAndHashCode;

@Embeddable
@EqualsAndHashCode(of = "no")
public class CourseNo implements Serializable {

    @Column(name = "course_no")
    private String no;

    public CourseNo() {
        this.no = UUID.randomUUID().toString();
    }

}
