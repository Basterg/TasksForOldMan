package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrayList = new ArrayList<>();
        initializeArray(arrayList);
        removeThirdElement(arrayList);
        printReverseArray(arrayList);
    }

    public static void initializeArray(ArrayList<String> arrayList) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            arrayList.add(reader.readLine());
        }
    }

    public static void removeThirdElement(ArrayList<String> arrayList) {
        arrayList.remove(2);
    }

    public static void printReverseArray(ArrayList<String> arrayList) {
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            System.out.println(arrayList.get(i));
        }
    }
}


