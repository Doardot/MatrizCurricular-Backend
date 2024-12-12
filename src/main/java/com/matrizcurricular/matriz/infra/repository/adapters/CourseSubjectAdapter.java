package com.matrizcurricular.matriz.infra.repository.adapters;

import com.matrizcurricular.matriz.domain.models.CourseSubjectModel;
import com.matrizcurricular.matriz.infra.repository.entities.CourseSubject;
import com.matrizcurricular.matriz.infra.repository.entities.pk.CourseSubjectPK;

// Problemas de dependencia circular

// public class CourseSubjectAdapter {
//    public static CourseSubject fromModel(CourseSubjectModel courseSubjectModel) {
//       return new CourseSubject(new CourseSubjectPK(CourseAdapter.fromModel(courseSubjectModel.getCourse()), SubjectAdapter.fromModel(courseSubjectModel.getSubject())), courseSubjectModel.getSemester(),
//             courseSubjectModel.getRequisiteTypes());
// }
