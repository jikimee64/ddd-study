package com.course.core.student.model.root;

import com.course.core.student.model.StudentNo;
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

    private String department;

    private String name;

    private String grade;

    private String gender;

    private String age;

    private String phoneNumber;

    private String address;

}
