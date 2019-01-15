package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static int elementsCount = 10;

    public static void main(String[] args) throws Exception {
        String[] list = initializeArray(8);
        printArray(list);
    }

    public static String[] initializeArray(int countOfInitialize) throws IOException {
        int a = countOfInitialize;
        String[] array = new String[elementsCount];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < a; i++) {
            array[i] = reader.readLine();
        }
        return array;
    }

    public static void printArray (String[] array) {
        int a = elementsCount;
        for (int i = a - 1; i > -1; i--) {
            System.out.println(array[i]);
        }
    }
}