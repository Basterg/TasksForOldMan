package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    static int index;

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
        int a;
        for (int i = 0; i < 4; i++) {
            a = array[i];
            array[i] = min(array, i);
            array[index] = a;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }
    }

    public static int min( int[] array, int a) {
        int min = array[a];
        for (int i = a; i < 5; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return min;
    }
}
