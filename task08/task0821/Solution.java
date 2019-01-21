package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        HashMap<String, String> map = new HashMap<>();
        map.put("dodov", "lars");
        map.put("dodov1", "lars1");
        map.put("dodov2", "lars1");
        map.put("dodov", "lars2");
        map.put("dodov3", "lars3");
        map.put("dodov4", "lars4");
        map.put("dodov4", "lars5");
        map.put("dodov5", "lars6");
        map.put("dodov6", "lars7");
        map.put("dodov7", "lars");
        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
