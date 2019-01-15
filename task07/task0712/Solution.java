package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrayList = new ArrayList<>();
        initializeArray(arrayList);
        printMinOrMaxLenghtString(arrayList);
    }

    public static void initializeArray(ArrayList<String> arrayList) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            arrayList.add(reader.readLine());
        }
    }

    public static int maxLenghtString(ArrayList<String> arrayList) {
        int max = arrayList.get(0).length();
        for (int i = 1; i < arrayList.size(); i++) {
            int j = arrayList.get(i).length();
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    public static int minLenghtString(ArrayList<String> arrayList) {
        int min = arrayList.get(0).length();
        for (int i = 1; i < arrayList.size(); i++) {
            int j = arrayList.get(i).length();
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    public static void printMinOrMaxLenghtString(ArrayList<String> arrayList) {
        int min = minLenghtString(arrayList);
        int max = maxLenghtString(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            int j = arrayList.get(i).length();
            if (j == min || j == max) {
                System.out.println(arrayList.get(i));
                break;
            }
        }
    }
}
