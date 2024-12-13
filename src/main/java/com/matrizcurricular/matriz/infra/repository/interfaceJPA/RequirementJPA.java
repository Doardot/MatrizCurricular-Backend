package com.matrizcurricular.matriz.infra.repository.interfaceJPA;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.matrizcurricular.matriz.infra.repository.entities.Requirements;

public interface RequirementJPA extends CrudRepository<Requirements, Long>{
    List<Requirements> findAll();
}
