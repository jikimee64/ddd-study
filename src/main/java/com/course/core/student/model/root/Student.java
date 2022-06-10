package com.course.core.student.model.root;

import com.course.core.student.model.Academic;
import com.course.core.student.model.Credit;
import com.course.core.student.model.StudentNo;
import javax.persistence.Embedded;
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

    @Embedded
    Academic academic; //학년 + 학기

    @Embedded
    private Credit credit; //학점

    public Student(StudentNo no, String department, String name, Academic academic) {
        this.no = no;
        this.department = department;
        this.name = name;
        this.academic = academic;
        this.credit = new Credit();
    }

    public void addCredit(Integer newCredit){
        this.credit = new Credit(this.credit.getCredit(), newCredit);
    }

}
