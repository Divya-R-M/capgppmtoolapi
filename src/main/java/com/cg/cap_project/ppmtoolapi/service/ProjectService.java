package com.cg.cap_project.ppmtoolapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.cap_project.ppmtoolapi.domain.Project;
import com.cg.cap_project.ppmtoolapi.exception.ProjectIDException;
import com.cg.cap_project.ppmtoolapi.repository.ProjectRepository;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository projectRepository;
	
	public Project saveOrUpdate(Project project) {
		//TODO Service logic on project
		try {
			project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
			return projectRepository.save(project);
		}
		catch(Exception e) {
			throw new ProjectIDException("ProjectIdentifier "+project.getProjectIdentifier()+" already available");
		}
	}
}
