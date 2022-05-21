package com.course.core.subject.model.root;

import com.course.core.subject.model.LeeSo;
import com.course.core.subject.model.SubjectNo;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 과목
 */
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Subject {

    private SubjectNo no;

    private String name;

    private LeeSo leeSo; //이수 구분

}
