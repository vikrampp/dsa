package com.eduvik.system.design;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class LFUCache {
  Map<Integer, Integer> keyValueMap;
  Map<Integer, Integer> keyCountMap;
  Map<Integer, LinkedHashSet<Integer>> countKeysMap;
  int capacity;
  int min = -1;

  public LFUCache(int capacity) {
    this.capacity = capacity;
    keyValueMap = new HashMap<>();
    keyCountMap = new HashMap<>();
    countKeysMap = new HashMap<>();
    countKeysMap.put(1, new LinkedHashSet<>());
  }

  public int get(int key) {
    if (!keyValueMap.containsKey(key)) {
      return -1;
    }
    int count = keyCountMap.get(key);
    keyCountMap.put(key, count + 1);
    countKeysMap.get(count).remove(key);

    if (count == min && countKeysMap.get(count).size() == 0) {
      min++;
    }
    if (!countKeysMap.containsKey(count + 1)) {
      countKeysMap.put(count + 1, new LinkedHashSet<>());
    }
    countKeysMap.get(count + 1).add(key);
    return keyValueMap.get(key);
  }

  public void put(int key, int val) {
    if (keyValueMap.containsKey(key)) {
      keyValueMap.put(key, val);
      get(key);
      return;
    }

    if (keyValueMap.size() == capacity) {
      int evictKey = countKeysMap.get(min).stream().findFirst().get();
      keyValueMap.remove(evictKey);
      keyCountMap.remove(evictKey);
      countKeysMap.get(min).remove(evictKey);
    }
    keyValueMap.put(key, val);
    keyCountMap.put(key, 1);
    countKeysMap.get(1).add(key);
    min = 1;
  }
}
