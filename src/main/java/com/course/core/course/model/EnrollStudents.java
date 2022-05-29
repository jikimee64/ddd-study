package com.course.core.course.model;

import com.course.core.student.model.StudentNo;
import java.time.LocalDateTime;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class EnrollStudents {

    @Embedded
    private StudentNo no;

    private LocalDateTime enrollDate;

    public EnrollStudents(StudentNo no) {
        this.no = no;
        this.enrollDate = LocalDateTime.now();
    }

}
