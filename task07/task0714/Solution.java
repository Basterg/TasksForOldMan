package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    static ArrayList<String> arrayList = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        initializeArray();
        removeThirdElement();
        printReverseArray();
    }

    public static void initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            arrayList.add(reader.readLine());
        }
    }

    public static void removeThirdElement() {
        arrayList.remove(2);
    }

    public static void printReverseArray() {
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            System.out.println(arrayList.get(i));
        }
    }
}


