package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    private static List<String> strings;
    static int maxLenght = 0;

    public static void main(String[] args) throws Exception {
        strings = initializeArrayAndFindLongestString();
        printLongestStrings(strings);
    }

    public static ArrayList<String> initializeArrayAndFindLongestString() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(reader.readLine());
            if (arrayList.get(i).length() > maxLenght) {
                maxLenght = arrayList.get(i).length();
            }
        }
        return arrayList;
    }

    public static void printLongestStrings(List<String> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).length() == maxLenght) {
                System.out.println(arrayList.get(i));
            }
        }
    }
}
