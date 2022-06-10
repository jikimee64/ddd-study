package com.course.core.student.application.dto.request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentRequest {

    private String department;
    private String name;
    private Integer grade;
    private Integer semester;

}
