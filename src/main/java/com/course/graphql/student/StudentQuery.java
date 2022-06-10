package com.course.graphql.student;

import com.course.core.student.application.dto.response.StudentResponse;
import com.course.core.student.model.Academic;
import com.course.core.student.model.StudentNo;
import com.course.core.student.model.root.Student;
import com.course.mapstruct.StudentMapper;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class StudentQuery implements GraphQLQueryResolver {

    public List<StudentResponse> getStudents(int count, int offset) {
        log.info("count {}", count);
        log.info("offset {}", offset);

        List<Student> students = new ArrayList<>();
        Student student = new Student(new StudentNo("1"), "부서", "이름",
            new Academic(4, 1));
        students.add(student);

        return StudentMapper.INSTANCE.toDtos(students);
    }

}
