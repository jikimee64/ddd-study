package com.course.core.student.model;

import java.io.Serializable;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@Embeddable
@AllArgsConstructor
@EqualsAndHashCode(of = "no")
@Access(AccessType.FIELD) //setter 사용 제한을 위한 필드 접근방식
public class StudentNo implements Serializable {

    @Column(name = "student_no")
    private String no;

    protected StudentNo() {
    }

    public static StudentNo of(String no) {
        return new StudentNo(no);
    }

}
