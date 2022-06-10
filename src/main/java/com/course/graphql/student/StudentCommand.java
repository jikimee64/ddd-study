package com.course.graphql.student;

import com.course.core.student.application.dto.request.StudentRequest;
import com.course.core.student.application.dto.response.StudentResponse;
import com.course.core.student.model.Academic;
import com.course.core.student.model.StudentNo;
import com.course.core.student.model.root.Student;
import com.course.mapstruct.StudentMapper;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class StudentCommand implements GraphQLMutationResolver {

    public boolean addStudent(StudentRequest studentRequest) {
        log.info("studentRequest {}", studentRequest);
        return true;
    }

    public StudentResponse putStudent(String name) {
        log.info("name {}", name);
        Student student = new Student(new StudentNo("1"), "부서", "이름",
            new Academic(4, 1));

        return StudentMapper.INSTANCE.toDto(student);
    }

}
