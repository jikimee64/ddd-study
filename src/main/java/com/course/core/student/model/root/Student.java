package com.course.core.student.model.root;

import com.course.core.student.model.StudentNo;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 학생
 */
@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Student {

    @EmbeddedId
    private StudentNo no;

    private String department; //학과

    private String name;

    private Integer grade; //학년

    private Integer semester; //학기

    private Integer credit; //학점

    public Student(String department, String name, Integer grade, Integer semester) {
        validGradeMax(grade);
        validSemesterMax(semester);
        this.department = department;
        this.name = name;
        this.grade = grade;
        this.semester = semester;
        this.credit = 0;
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

    public void addCredit(Integer credit) {
        validMaxCredit(credit);
        this.credit += credit;
    }

    private void validMaxCredit(Integer credit) {
        if (this.credit + credit > 21) {
            throw new IllegalArgumentException("max credit");
        }
    }

}
