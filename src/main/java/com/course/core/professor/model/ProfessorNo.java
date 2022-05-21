package com.course.core.professor.model;

import java.util.UUID;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(of = "no")
public class ProfessorNo {

    private String no;

    public ProfessorNo() {
        this.no = UUID.randomUUID().toString();
    }

}
