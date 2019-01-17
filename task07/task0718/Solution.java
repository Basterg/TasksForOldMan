package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arrayList = new ArrayList<>();
        initializeArray(arrayList);
        isAssorted(arrayList);
    }

    public static void initializeArray(ArrayList<String> arrayList) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            arrayList.add(reader.readLine());
        }
    }

    public static void isAssorted(ArrayList<String> arrayList) {
        for (int i = 0; i < arrayList.size() - 1; i++) {
            int j = arrayList.get(i).length();
            int k = arrayList.get(i + 1).length();
            if (j > k) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}

