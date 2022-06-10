package com.course.core.professor.model.root;

import com.course.core.professor.model.ProfessorNo;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 교수
 */
@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Professor {

    @EmbeddedId
    private ProfessorNo no;

    private String department;

    private String name;

    private String phoneNumber;

    private String labLocation;

    private String address;

    private String gender;

    public Professor(ProfessorNo no, String department, String name, String phoneNumber,
        String labLocation, String address, String gender) {
        this.no = no;
        this.department = department;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.labLocation = labLocation;
        this.address = address;
        this.gender = gender;
    }

}
