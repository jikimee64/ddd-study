package com.course.mapstruct;

import com.course.core.student.model.root.Student;
import com.course.graphql.student.dto.response.StudentResponse;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT)
public interface StudentMapper {

    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

    List<StudentResponse> toDtos(List<Student> students);

    StudentResponse toDto(Student student);

}
