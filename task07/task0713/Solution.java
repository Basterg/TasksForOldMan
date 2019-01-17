package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    static ArrayList<Integer> arrayList = new ArrayList<>();
    static ArrayList<Integer> arrayListMultipleOf2 = new ArrayList<>();
    static ArrayList<Integer> arrayListMultipleOf3 = new ArrayList<>();
    static ArrayList<Integer> arrayList1Other = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        initializeArray(arrayList);
        multiplicitySorting(arrayList, arrayListMultipleOf2, arrayListMultipleOf3, arrayList1Other);
        printList(arrayListMultipleOf2, arrayListMultipleOf3, arrayList1Other);
    }

    public static void initializeArray(ArrayList<Integer> arrayList) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            arrayList.add(Integer.parseInt(reader.readLine()));
        }
    }

    public static void multiplicitySorting(ArrayList<Integer> a, ArrayList<Integer> a2,
                           ArrayList<Integer> a3, ArrayList<Integer> aO) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) % 2 == 0 && a.get(i) % 3 == 0) {
                a2.add(a.get(i));
                a3.add(a.get(i));
            } else if (a.get(i) % 2 == 0) {
                a2.add(a.get(i));
            } else if (a.get(i) % 3 == 0) {
                a3.add(a.get(i));
            } else {
                aO.add(a.get(i));
            }
        }
    }

    public static void printList(ArrayList<Integer> a2, ArrayList<Integer> a3, ArrayList<Integer> aO) {
        for (int i = 0; i < a2.size(); i++) {
            System.out.println(a2.get(i));
        }
        for (int i = 0; i < a3.size(); i++) {
            System.out.println(a3.get(i));
        }
        for (int i = 0; i < aO.size(); i++) {
            System.out.println(aO.get(i));
        }
    }
}
