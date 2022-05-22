package com.course.core.subject.model;

import java.io.Serializable;
import java.util.UUID;
import javax.persistence.Embeddable;
import lombok.EqualsAndHashCode;

@Embeddable
@EqualsAndHashCode(of = "no")
public class SubjectNo implements Serializable {

    private final String no;

    public SubjectNo() {
        this.no = UUID.randomUUID().toString();
    }

}
