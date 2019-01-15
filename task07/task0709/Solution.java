package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Выражаемся покороче
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        ArrayList<String> arrayList = new ArrayList<>();
        initializeArray(arrayList);
        printLongestStrings(arrayList);
    }

    public static void initializeArray(ArrayList<String> arrayList) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            arrayList.add(s);
        }
    }

    public static void printLongestStrings(ArrayList<String> arrayList) {
        int min = arrayList.get(0).length();
        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i).length() < min) {
                min = arrayList.get(i).length();
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).length() == min) {
                System.out.println(arrayList.get(i));
            }
        }
    }
}