package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
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
        ArrayList<String> listOfValues = new ArrayList<>(map.values());
        for (int i = 0; i < listOfValues.size(); i++) {
            for (int j = 0; j < listOfValues.size(); j++) {
                if (listOfValues.get(i).equals(listOfValues.get(j)) && i != j) {
                    removeItemFromMapByValue(map, listOfValues.get(j));
                }
            }
        }
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