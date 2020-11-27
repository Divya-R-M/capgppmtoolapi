package com.cg.cap_project.ppmtoolapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.cap_project.ppmtoolapi.domain.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long>{

	//TODO : no need to add CRUD methods, Methods can be customized.
	
	Project findByProjectIdentifier(String projectIdentifier);
    
	
}
