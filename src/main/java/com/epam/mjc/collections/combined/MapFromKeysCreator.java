package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> resultMap = new HashMap<>();

        for (Map.Entry<String, Integer> entry : sourceMap.entrySet()) {
            String key = entry.getKey();
            int length = key.length();

            if (!resultMap.containsKey(length)) {
                resultMap.put(length, new HashSet<>());
            }

            resultMap.get(length).add(key);
        }

        return resultMap;
    }
}

