package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        while (true) {
            String string = reader.readLine();
            if (string.isEmpty()) {
                break;
            }
            int id = Integer.parseInt(string);

            String name = reader.readLine();
            if (name.isEmpty()) {
                break;
            }
            map.put(name, id);
        }

        printMap(map);
    }

    public static void printMap(HashMap<String, Integer> map) {
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getValue() + " " + pair.getKey());
        }
    }
}
