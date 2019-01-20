package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Lalov", 501);
        map.put("Lalov1", 50);
        map.put("Lalov2", 502);
        map.put("Lalov3", 503);
        map.put("Lalov4", 0);
        map.put("Lalov5", 504);
        map.put("Lalov6", 504);
        map.put("Lalov7", 505);
        map.put("Lalov8", 666);
        map.put("Lalov9", 55);

        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> mapIterator = map.entrySet().iterator();
        while (mapIterator.hasNext()) {
            Map.Entry<String, Integer> nextPair = mapIterator.next();
            if (nextPair.getValue() < 500) {
                mapIterator.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}