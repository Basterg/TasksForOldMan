package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrayList = initializeArray();
        printArray(arrayList);
    }

    public static ArrayList<String> initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(0, reader.readLine());
        }
        return arrayList;
    }

    public static void printArray(ArrayList<String> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
