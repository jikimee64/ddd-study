package com.course.core.student.model;

import java.io.Serializable;
import java.util.UUID;
import javax.persistence.Embeddable;
import lombok.EqualsAndHashCode;

@Embeddable
@EqualsAndHashCode(of = "no")
public class StudentNo implements Serializable {

    private String no;

    public StudentNo() {
        this.no = UUID.randomUUID().toString();
    }

}
