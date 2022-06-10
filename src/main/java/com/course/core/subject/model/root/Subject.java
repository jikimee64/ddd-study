package com.course.core.subject.model.root;

import com.course.core.subject.model.LeeSo;
import com.course.core.subject.model.SubjectNo;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 과목
 */
@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Subject {

    @EmbeddedId
    private SubjectNo no;

    private String name;

    private LeeSo leeSo; //이수 구분

    public Subject(SubjectNo no, String name, LeeSo leeSo) {
        this.no = no;
        this.name = name;
        this.leeSo = leeSo;
    }

}
