package com.javarush.task.task07.task0707;

import java.util.ArrayList;


public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arraylist = new ArrayList<>();
        initializeArray(arraylist);
        System.out.println(arraylist.size());
        printArrayList(arraylist);
    }

    public static void initializeArray(ArrayList<String> arrayList) {
        String s = "0";
        for (int i = 0; i < 5; i++) {
            s += "1";
            arrayList.add(s);
        }
    }

    public static void printArrayList(ArrayList<String> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
