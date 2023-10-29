package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> resultProjects = new ArrayList<>();

        for (Map.Entry<String, Set<String>> entry : projects.entrySet()) {
            String projectName = entry.getKey();
            Set<String> developers = entry.getValue();

            if (developers.contains(developer)) {
                resultProjects.add(projectName);
            }
        }

        Collections.sort(resultProjects, new Comparator<String>() {
            @Override
            public int compare(String project1, String project2) {
                if (project1.length() != project2.length()) {
                    return Integer.compare(project2.length(), project1.length());
                }
                return project2.compareTo(project1);
            }
        });

        return resultProjects;
    }
}

