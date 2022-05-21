package com.course.core.course.model;

import com.course.core.professor.model.ProfessorNo;
import java.time.LocalDateTime;

public class Professor {

    private ProfessorNo no;

    private LocalDateTime openDate;

    public Professor(ProfessorNo no) {
        this.no = no;
        this.openDate = LocalDateTime.now();
    }

}
