package com.course.mapstruct;

import com.course.core.student.application.dto.response.StudentResponse;
import com.course.core.student.model.root.Student;
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
