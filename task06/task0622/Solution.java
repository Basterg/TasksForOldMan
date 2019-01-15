package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    private static int indexOfMin;

    public static void main(String[] args) throws Exception {
        int[] list = new int[5];
        initializeArray(list);
        printArrayAscending(list);
    }

    public static void initializeArray(int[] array) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            int a = Integer.parseInt(reader.readLine());
            array[i] = a;
        }
    }

    public static void printArrayAscending(int[] array) {
        for (int i = 0; i < 4; i++) {
            int a = array[i];
            array[i] = min(array, i);
            array[indexOfMin] = a;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }
    }

    public static int min( int[] array, int initialIndex) {
        int min = array[initialIndex];
        for (int i = initialIndex + 1; i < 5; i++) {
            int a = array[i];
            if (a < min) {
                min = a;
                indexOfMin = i;
            }
        }
        return min;
    }
}
