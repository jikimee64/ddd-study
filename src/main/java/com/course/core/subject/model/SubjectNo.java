package com.course.core.subject.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@Embeddable
@AllArgsConstructor
@EqualsAndHashCode(of = "no")
public class SubjectNo implements Serializable {

    @Column(name = "subject_no")
    private String no;

    protected SubjectNo() {
    }

    public static SubjectNo of(String no){
        return new SubjectNo(no);
    }

}
