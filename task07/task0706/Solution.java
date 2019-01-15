package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] list = new int[15];
        initializeArray(list);
        whereLivesMore(list);
    }

    public static int[] initializeArray(int[] array) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 15; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        return array;
    }

    public static void whereLivesMore(int[] array) {
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < 15; i++) {
            if (i % 2 == 0) {
                sumEven += array[i];
            } else {
                sumOdd += array[i];
            }
        }
        if (sumEven > sumOdd) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else if (sumEven < sumOdd) {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
