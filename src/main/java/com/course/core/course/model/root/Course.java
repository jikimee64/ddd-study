package com.course.core.course.model.root;

import com.course.core.course.model.CourseNo;
import com.course.core.course.model.CourseState;
import com.course.core.course.model.CourseTime;
import com.course.core.course.model.EnrollCount;
import com.course.core.course.model.EnrollStudents;
import com.course.core.professor.model.ProfessorNo;
import com.course.core.subject.model.SubjectNo;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 수강
 */
@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Course {

    @EmbeddedId
    private CourseNo no;

    @Embedded
    private ProfessorNo professorNo;

    private String department;

    @ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(name = "enroll_students", joinColumns = @JoinColumn(name = "course_no"))
    private List<EnrollStudents> students = new ArrayList<>();

    @Embedded
    private SubjectNo subjectNo;

    @Embedded
    private CourseTime courseTime;

    @Embedded
    private EnrollCount enrollCount;

    private String location;

    private CourseState courseState;

    public Course(CourseNo no, ProfessorNo professorNo, String department, SubjectNo subjectNo,
        CourseTime courseTime, EnrollCount enrollCount, String location, CourseState courseState) {
        this.no = no;
        this.professorNo = professorNo;
        this.department = department;
        this.subjectNo = subjectNo;
        this.courseTime = courseTime;
        this.enrollCount = enrollCount;
        this.location = location;
        this.courseState = courseState;
    }

}
