package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> arrayList = new ArrayList<>();
        initializeArray(arrayList);
        printLengthOfLongestSequence(arrayList);
    }

    public static void initializeArray(ArrayList<Integer> arrayList) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            arrayList.add(Integer.parseInt(reader.readLine()));
        }
    }

    public static void printLengthOfLongestSequence(ArrayList<Integer> arrayList) {
        int count = 1; // Счётчик самой длинной последовательности
        int addCount = 1; // Дополнительный счётчик (буферный)
        for (int i = 0; i < 9; i++) {
            int element = arrayList.get(i);
            int nextElement = arrayList.get(i + 1);
            if (element == nextElement) {
                addCount += 1;
            } else {
                addCount = 1;
            }
            if (addCount > count) {
                count = addCount;
            }
        }
        System.out.println(count);
    }
}