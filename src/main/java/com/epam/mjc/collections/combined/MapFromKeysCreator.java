package com.epam.mjc.collections.combined;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class MapFromKeysCreator {
	public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
		Map<Integer, Set<String>> map = new HashMap<>();
		for (Map.Entry<String, Integer> entry : sourceMap.entrySet()) {
			if (!map.containsKey(entry.getKey().length())) {
				Set<String> set = new HashSet<>();
				map.put(entry.getKey().length(), set);
			}
			map.get(entry.getKey().length()).add(entry.getKey());
		}
		return map;
	}
}
