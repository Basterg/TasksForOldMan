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
        printMinOrMaxLengthString(arrayList);
    }

    public static void initializeArray(ArrayList<String> arrayList) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            arrayList.add(reader.readLine());
        }
    }

    public static void printMinOrMaxLengthString(ArrayList<String> arrayList) {
        int minLengthOfString = arrayList.get(0).length();
        int maxLengthOfString = arrayList.get(0).length();
        int indexOfMinOrMax = 0;
        for (int i = arrayList.size() - 1; i > 0; i--) {
            int lengthOfString = arrayList.get(i).length();
            if (lengthOfString >= maxLengthOfString) {
                maxLengthOfString = lengthOfString;
                indexOfMinOrMax = i;
            } else if (lengthOfString <= minLengthOfString) {
                minLengthOfString = lengthOfString;
                indexOfMinOrMax = i;
            }
        }
        System.out.println(arrayList.get(indexOfMinOrMax));
    }
}
