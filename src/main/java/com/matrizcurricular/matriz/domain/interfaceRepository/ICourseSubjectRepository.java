package com.matrizcurricular.matriz.domain.interfaceRepository;

import java.util.List;

import com.matrizcurricular.matriz.domain.models.CourseSubjectModel;
import com.matrizcurricular.matriz.domain.models.RequirementsModel;

public interface ICourseSubjectRepository {
   List<CourseSubjectModel> getCourseSubjectByCourse(String curriculumCode);
   List<RequirementsModel> getRequirementsByCourseSubject(String curriculumCode, String creditCode);
}
