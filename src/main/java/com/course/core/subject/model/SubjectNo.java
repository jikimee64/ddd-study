package com.course.core.subject.model;

import java.util.UUID;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(of = "no")
public class SubjectNo {

    private final String no;

    public SubjectNo() {
        this.no = UUID.randomUUID().toString();
    }

}
