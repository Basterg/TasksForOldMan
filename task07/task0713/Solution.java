package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    static private ArrayList<Integer> a = new ArrayList<>();
    //a - список, который мы заполним 20тью целыми числами
    static private ArrayList<Integer> a2 = new ArrayList<>();
    //a2 - список, который мы заполним числами кратными двум, которые содержатся в списке "а"
    static private ArrayList<Integer> a3 = new ArrayList<>();
    //a3 - список, который мы заполним числами кратными трём, которые содержатся в списке "а"
    static private ArrayList<Integer> aO = new ArrayList<>();
    //aO - список, который мы заполним числами не кратными трём и двум, которые содержатся в списке "а"

    public static void main(String[] args) throws Exception {
        initializeArray();
        multiplicitySorting();
        printList();
    }

    public static void initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            a.add(Integer.parseInt(reader.readLine()));
        }
    }

    public static void multiplicitySorting() {
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

    public static void printList() {
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
