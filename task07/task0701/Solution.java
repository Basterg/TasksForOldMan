package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Массивный максимум
*/

public class Solution {
    static int elementsCount = 20;

    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        int[] array = new int[elementsCount];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < elementsCount; i++) {
            int a = Integer.parseInt(reader.readLine());
            array[i] = a;
        }
        return array;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < elementsCount; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
