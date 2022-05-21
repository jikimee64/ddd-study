package com.course.core.course.model.root;

import com.course.core.course.model.CourseNo;
import com.course.core.course.model.CourseState;
import com.course.core.course.model.EnrollCount;
import com.course.core.course.model.EnrollStudents;
import com.course.core.course.model.Professor;
import com.course.core.subject.model.SubjectNo;
import java.time.Duration;
import java.util.List;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 수강
 */
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Course {

    private CourseNo no;

    private Professor professor;

    private String department;

    private List<EnrollStudents> students;

    private SubjectNo subjectNo;

    private Duration times;

    private EnrollCount enrollCount;

    private String location;

    private CourseState courseState;

}
