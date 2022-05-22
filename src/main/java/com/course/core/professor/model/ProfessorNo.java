package com.course.core.professor.model;

import java.io.Serializable;
import java.util.UUID;
import javax.persistence.Embeddable;
import lombok.EqualsAndHashCode;

@Embeddable
@EqualsAndHashCode(of = "no")
public class ProfessorNo implements Serializable {

    private String no;

    public ProfessorNo() {
        this.no = UUID.randomUUID().toString();
    }

}
