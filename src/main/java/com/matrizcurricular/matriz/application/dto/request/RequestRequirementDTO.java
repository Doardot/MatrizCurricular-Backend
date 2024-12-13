package com.matrizcurricular.matriz.application.dto.request;

public class RequestRequirementDTO {
    private String creditCode;
    private String curriculumCode;

    public RequestRequirementDTO(String creditCode, String curriculumCode) {
        this.creditCode = creditCode;
        this.curriculumCode = curriculumCode;
    }
    
    public String getCreditCode() {
        return creditCode;
    }
    
    public String getCurriculumCode() {
        return curriculumCode;
    }

    @Override
    public String toString() {
        return "RequestRequirementDTO - creditCode = " + creditCode + ", curriculumCode = " + curriculumCode;
    }
    
}
