package com.javarush.task.task07.task0720;

import org.omg.CORBA.ARG_IN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        ArrayList<String> arrayList = new ArrayList<>();
        initializeArray(arrayList, n);
        transpositStrings(arrayList, m);
        printArray(arrayList);
    }

    public static void initializeArray(ArrayList<String> arrayList, int n) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < n; i++) {
            arrayList.add(reader.readLine());
        }
    }

    public static void transpositStrings(ArrayList<String> arrayList, int m) {
        for (int i = 0, j = 0; j < m; j++) {
            arrayList.add(arrayList.remove(i));
        }
    }

    public static void printArray(ArrayList<String> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
