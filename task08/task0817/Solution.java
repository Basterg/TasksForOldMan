package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

ppublic class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Lalov", "lol");
        map.put("Lalov1", "lol1");
        map.put("Lalov2", "lol2");
        map.put("Lalov3", "lol3");
        map.put("Lalov4", "lol1");
        map.put("Lalov5", "lol1");
        map.put("Lalov6", "lol4");
        map.put("Lalov7", "lol5");
        map.put("Lalov8", "lol3");
        map.put("Lalov9", "lol6");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        removeItemFromMapByValue(map, "lol1");
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
        System.out.println(map);
    }
}