package com.epam.mjc.collections.combined;

import java.util.List;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.Collections;
import java.util.Comparator;

public class DeveloperProjectFinder {
	public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
		List<String> developerProjects = new LinkedList<>();
		for (Map.Entry<String, Set<String>> project : projects.entrySet()) {
			if (project.getValue().contains(developer)) {
				developerProjects.add(project.getKey());
			}
		}
		Collections.sort(developerProjects, new StringComparator());
		return developerProjects;
	}
}

class StringComparator implements Comparator<String> {
	public int compare(String s1, String s2) {
		if (s1.length() > s2.length()) {
			return -1;
		} else if (s1.length() < s2.length()) {
			return 1;
		} else {
			if (0 == s1.compareTo(s2)) {
				return 0;
			} else {
				return -s1.compareTo(s2);
			}
		}
	}
}
