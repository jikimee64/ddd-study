package com.course.core.course.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@Embeddable
@AllArgsConstructor
@EqualsAndHashCode(of = "no")
public class CourseNo implements Serializable {

    @Column(name = "course_no")
    private String no;

    protected CourseNo() {
    }

    public static CourseNo of(String no){
        return new CourseNo(no);
    }

}
