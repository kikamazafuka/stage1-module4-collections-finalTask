package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> map = new HashMap<>();
        for (Map.Entry<String,Integer> entry : sourceMap.entrySet()){
            String key = entry.getKey();
            int size = key.length();
            Set<String> set = new HashSet<>();
            for (String value : sourceMap.keySet()) {
                if (value.length()==size){
                    set.add(value);
                }
            }
            map.put(size,set);
        }
        return map;
    }
}
