package com.matrizcurricular.matriz.entity.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CourseDTO {

    private Long id;
    private String name;
    private String curriculumCode;
    private int numberSemesters;

    public CourseDTO(String name, String curriculumCode, int numberSemesters) {
        this.name = name;
        this.curriculumCode = curriculumCode;
        this.numberSemesters = numberSemesters;
    }
}