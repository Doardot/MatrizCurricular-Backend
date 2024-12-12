package com.matrizcurricular.matriz.infra.repository.adapters;

import java.util.List;

import com.matrizcurricular.matriz.application.dto.RequirementsDTO;
import com.matrizcurricular.matriz.domain.models.RequirementsModel;
import com.matrizcurricular.matriz.infra.repository.entities.Requirements;

public class RequirementsAdapter {

   public static Requirements fromModel(RequirementsModel requirementsModel) {
      return new Requirements(requirementsModel.getRequisiteType(),
            SubjectAdapter.fromModel(requirementsModel.getSubject()));
   }

   public static List<Requirements> listFromModel(List<RequirementsModel> requirementsModels) {
      return requirementsModels.stream().map(r -> fromModel(r)).toList();
   }

   public static RequirementsModel toModel(Requirements requirements) {
      return new RequirementsModel(requirements.getId(), requirements.getRequisiteType(),
            SubjectAdapter.toModel(requirements.getSubject()));
   }

   public static List<RequirementsModel> listToModel(List<Requirements> requirements) {
      return requirements.stream().map(r -> toModel(r)).toList();
   }

   public static RequirementsDTO toDTO(RequirementsModel requirements) {
      return new RequirementsDTO(requirements.getId(), requirements.getRequisiteType(),
            SubjectAdapter.toDTO(requirements.getSubject()));
   }

   public static List<RequirementsDTO> listToDTO(List<RequirementsModel> requirements) {
      return requirements.stream().map(r -> toDTO(r)).toList();
   }
}
