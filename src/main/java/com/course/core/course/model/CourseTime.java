package com.course.core.course.model;

import java.time.LocalDateTime;
import javax.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Embeddable
@EqualsAndHashCode(of = {"startDate", "endDate"})
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CourseTime {

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    public CourseTime(LocalDateTime startDate, LocalDateTime endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

}
