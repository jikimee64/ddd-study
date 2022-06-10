package com.course.core.professor.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@Embeddable
@AllArgsConstructor
@EqualsAndHashCode(of = "no")
public class ProfessorNo implements Serializable {

    @Column(name = "professor_no")
    private String no;

    protected ProfessorNo() {
    }

    public static ProfessorNo of(String no) {
        return new ProfessorNo(no);
    }

}
