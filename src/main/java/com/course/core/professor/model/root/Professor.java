package com.course.core.professor.model.root;

import com.course.core.professor.model.ProfessorNo;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 교수
 */
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Professor {

    private ProfessorNo no;

    private String department;

    private String name;

    private String phoneNumber;

    private String labLocation;

    private String address;

    private String gender;

}
