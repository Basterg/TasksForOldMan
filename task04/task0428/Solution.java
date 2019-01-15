package com.javarush.task.task04.task0428;

/* 
Положительное число
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
        System.out.println(numberOfPositive(i1, i2, i3));
    }
    public static int count = 0;
    public static int numberOfPositive(int a, int b, int c) {
        defineOfPositivity(a);
        defineOfPositivity(b);
        defineOfPositivity(c);
        return count;
    }
    public static void defineOfPositivity(int a) {
        if (a > 0) {
            count++;
        }
    }
}
