package com.course.core.student.model;

import javax.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Academic {

    private Integer grade; //학년

    private Integer semester; //학기

    public Academic(Integer grade, Integer semester) {
        validGradeMax(grade);
        validSemesterMax(semester);
        this.grade = grade;
        this.semester = semester;
    }

    public void validGradeMax(Integer grade) {
        if (grade == null || grade > 4) {
            throw new IllegalArgumentException("grade must less than 5");
        }
    }

    public void validSemesterMax(Integer semester) {
        if (semester == null || semester > 2) {
            throw new IllegalArgumentException("grade must less than 5");
        }
    }

}
