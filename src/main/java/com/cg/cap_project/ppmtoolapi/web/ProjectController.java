package com.cg.cap_project.ppmtoolapi.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.cap_project.ppmtoolapi.domain.Project;
import com.cg.cap_project.ppmtoolapi.service.ProjectService;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {

	@Autowired
	private ProjectService projectService;
	
	@PostMapping("")
	public Project createNewProject(Project project) {
		return projectService.saveOrUpdate(project);
	}
}
