package com.course.core.course.model.root;

import com.course.core.course.model.CourseNo;
import com.course.core.course.model.CourseState;
import com.course.core.course.model.EnrollCount;
import com.course.core.course.model.EnrollStudents;
import com.course.core.professor.model.ProfessorNo;
import com.course.core.subject.model.SubjectNo;
import java.time.Duration;
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
    //@OrderColumn(name = "line_idx")
    private List<EnrollStudents> students;

    @Embedded
    private SubjectNo subjectNo;

    private Duration times;

    @Embedded
    private EnrollCount enrollCount;

    private String location;

    private CourseState courseState;

}
