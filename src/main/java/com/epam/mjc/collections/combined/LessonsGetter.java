package com.epam.mjc.collections.combined;

import java.util.*;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> set = new HashSet<>();
        for(List<String> values : timetable.values()){
            set.addAll(values);
        }
        return set;
    }
}
