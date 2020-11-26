package com.cg.cap_project.ppmtoolapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.cap_project.ppmtoolapi.domain.Project;
import com.cg.cap_project.ppmtoolapi.repository.ProjectRepository;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository projectRepository;
	
	public Project saveOrUpdate(Project project) {
		//TODO Service logic on project
		return projectRepository.save(project);
	}
}
