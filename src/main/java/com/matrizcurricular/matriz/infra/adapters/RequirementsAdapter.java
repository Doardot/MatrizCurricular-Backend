package com.matrizcurricular.matriz.infra.adapters;

import java.util.List;

import com.matrizcurricular.matriz.application.dto.response.RequirementsDTO;
import com.matrizcurricular.matriz.domain.models.RequirementsModel;
import com.matrizcurricular.matriz.infra.database.entities.Requirements;

public class RequirementsAdapter {

   public static Requirements fromModel(RequirementsModel requirementsModel) {
      return new Requirements(requirementsModel.getRequisiteType());
   }

   public static List<Requirements> listFromModel(List<RequirementsModel> requirementsModels) {
      return requirementsModels.stream().map(r -> fromModel(r)).toList();
   }

   public static RequirementsModel toModel(Requirements requirements) {
      return new RequirementsModel(requirements.getId(), requirements.getRequisiteType(),
            requirements.getCourseSubject().getSubject().getCreditCode(),
            requirements.getCourseSubject().getSubject().getName(),
            requirements.getPreRequirement().getSubject().getCreditCode(),
            requirements.getPreRequirement().getSubject().getName());
   }

   public static List<RequirementsModel> listToModel(List<Requirements> requirements) {
      return requirements.stream().map(r -> toModel(r)).toList();
   }

   public static RequirementsDTO toDTO(RequirementsModel requirements) {
      return new RequirementsDTO(requirements.getId(), requirements.getRequisiteType(),
            requirements.getCourseSubjectCreditCode(), requirements.getCourseSubjectName(),
            requirements.getPreRequirementCreditCode(), requirements.getPreRequirementName());
   }

   public static List<RequirementsDTO> listToDTO(List<RequirementsModel> requirements) {
      return requirements.stream().map(r -> toDTO(r)).toList();
   }
}
