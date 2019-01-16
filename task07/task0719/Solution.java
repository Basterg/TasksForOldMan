package com.javarush.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Вывести числа в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> arrayList = new ArrayList<>();
        initializeArray(arrayList);
        printReverseArray(arrayList);
    }

    public static void initializeArray(ArrayList<Integer> arrayList) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            arrayList.add(Integer.parseInt(reader.readLine()));
        }
    }

    public static void printReverseArray(ArrayList<Integer> arrayList) {
        for (int i = 9; i >= 0; i--) {
            System.out.println(arrayList.get(i));
        }
    }
}
