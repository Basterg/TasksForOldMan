package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("мама");
        arrayList.add("мыла");
        arrayList.add("раму");
        addStrings(arrayList);
        printArray(arrayList);
    }

    public static void addStrings(ArrayList<String> arrayList) {
        for (int i = 1; i < arrayList.size() * 2; i += 2) {
            arrayList.add(i, "именно");
        }
    }

    public static void printArray(ArrayList<String> arrayList) {
        for (int i = 0; i < arrayList.size() * 2; i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
