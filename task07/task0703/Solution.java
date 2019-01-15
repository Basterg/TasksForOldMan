package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) throws Exception {
        String[] stringsList = new String[10];
        initializeStringArray(stringsList);
        int[] numbersList = new int[10];
        initializeIntArray(stringsList, numbersList);
        printIntArray(numbersList);
    }

    public static void initializeStringArray(String[] array) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            array[i] = reader.readLine();
        }
    }

    public static void initializeIntArray(String[] arrayS, int[] arrayN) {
        for (int i = 0; i < 10; i++) {
            arrayN[i] = arrayS[i].length();
        }
    }

    public static void printIntArray(int[] array) {
        for (int i = 0; i < 10; i++) {
            System.out.println(array[i]);
        }
    }
}
