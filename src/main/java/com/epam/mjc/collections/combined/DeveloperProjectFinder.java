package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> list = new ArrayList<>();
        for(Map.Entry<String, Set<String>> project : projects.entrySet()){
            if (project.getValue().contains(developer)){
                list.add(project.getKey());
            }
        }
        list.sort(Comparator.comparingInt(String::length).reversed());
        return list;
    }
}
