package com.javarush.task.task08.task0804;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* 
Вывести на экран список ключей
*/

public class Solution {
    static HashMap<String, String> map = new HashMap<>();

    public static void main(String[] args) throws Exception {
        fillMap();
        printKeys();
    }

    public static void printKeys() {
        Set<String> keySet = map.keySet();
        for (String key : keySet){
            System.out.println(key);
        }
    }

    public static void fillMap() {
        map.put("Sim", "Sim");
        map.put("Tom", "Tom");
        map.put("Arbus", "Arbus");
        map.put("Baby", "Baby");
        map.put("Cat", "Cat");
        map.put("Dog", "Dog");
        map.put("Eat", "Eat");
        map.put("Food", "Food");
        map.put("Gevey", "Gevey");
        map.put("Hugs", "Hugs");
    }
}
