package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] list = new int[10];
        initializeArray(list);
        reveresePrintArray(list);
    }

    public static void initializeArray(int[] array) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
    }

    public static void reveresePrintArray(int[] array) {
        for (int i = 9; i > -1; i--) {
            System.out.println(array[i]);
        }
    }
}

