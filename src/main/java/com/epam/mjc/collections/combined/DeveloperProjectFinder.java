package com.epam.mjc.collections.combined;

import java.util.List;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.Collections;

public class DeveloperProjectFinder {
	public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
		List<String> developerProjects = new LinkedList<>();
		for (Map.Entry<String, Set<String>> project : projects.entrySet()) {
			if (project.getValue().contains(developer)) {
				developerProjects.add(project.getKey());
			}
		}
		Collections.reverse(developerProjects);
		return developerProjects;
	}
}
