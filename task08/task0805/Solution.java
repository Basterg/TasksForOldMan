package com.javarush.task.task08.task0805;

import java.awt.*;
import java.util.*;

/* 
На экране — значения!
*/

public class Solution {
    static HashMap<String, String> map = new HashMap<>();

    public static void main(String[] args) throws Exception {
        fillMap();
        printValues();
    }

    public static void printValues() {
        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value);
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
