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
        remove3dAndPrintReverseArray(arrayList);
    }

    public static void initializeArray(ArrayList<String> arrayList) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            arrayList.add(reader.readLine());
        }
    }

    public static void remove3dAndPrintReverseArray(ArrayList<String> arrayList) {
        arrayList.remove(2);
        for (int i = 3; i >= 0; i--) {
            System.out.println(arrayList.get(i));
        }
    }
}


