package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
       int[] list = new int[20];
       initializeList(list);
        System.out.println(findMax(list) + " " + findMin(list));
    }

    public static void initializeList(int[] list) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            list[i] = Integer.parseInt(reader.readLine());
        }
    }

    public static int findMax(int[] list) {
        int max = list[0];
        for (int i = 1; i < 20; i++) {
            if (list[i] > max) {
                max = list[i];
            }
        }
        return max;
    }

    public static int findMin(int[] list) {
        int min = list[0];
        for (int i = 1; i < 20; i++) {
            if (list[i] < min) {
                min = list[i];
            }
        }
        return min;
    }
}
