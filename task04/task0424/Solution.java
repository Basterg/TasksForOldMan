package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Reader reader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String s1 = bufferedReader.readLine();
        String s2 = bufferedReader.readLine();
        String s3 = bufferedReader.readLine();
        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);
        int i3 = Integer.parseInt(s3);
        calculateNumber(i1, i2, i3);
    }
    public static void calculateNumber(int a, int b, int c) {
        if (a == b) {
            System.out.println(3);
        } else if (a == c) {
            System.out.println(2);
        } else if (b == c) {
            System.out.println(1);
        }
    }
}