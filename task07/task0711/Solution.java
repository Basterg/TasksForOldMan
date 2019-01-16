package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrayList = new ArrayList<>();
        initializeArray(arrayList);
        moveLastString(arrayList);
        printArray(arrayList);
    }

    public static void initializeArray(ArrayList<String> arrayListt) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            arrayListt.add(reader.readLine());
        }
    }

    public static void moveLastString(ArrayList<String> arrayList) {
        int lastIndex = arrayList.size() - 1;
        for (int i = 0; i < 13; i++) {
            String lastString = arrayList.remove(lastIndex);
            arrayList.add(0, lastString);
        }
    }

    public static void printArray(ArrayList<String> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
