package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    static ArrayList<String> arrayList = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        initializeArray();
        doubleValues();
        printArray();
    }

    public static void initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            arrayList.add(reader.readLine());
        }
    }

    public static ArrayList<String> doubleValues() {
        for (int i = 0; i < arrayList.size(); i += 2) {
            arrayList.add(i + 1, arrayList.get(i));
        }
        return arrayList;
    }

    public static void printArray() {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
