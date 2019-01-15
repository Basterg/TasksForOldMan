package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
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
        defineNumberOfPositiveAndNegative(i1, i2, i3);
        System.out.println("количество отрицательных чисел: " + numberOfNegative);
        System.out.println("количество положительных чисел: " + numberOfPositive);
    }
    public static int numberOfPositive;
    public static int numberOfNegative;
    public static void defineNumberOfPositiveAndNegative(int a, int b, int c) {
        findOutPositivity(a);
        findOutPositivity(b);
        findOutPositivity(c);
    }
    public static void findOutPositivity(int a){
        if (a > 0) {
            numberOfPositive++;
        } else if (a < 0) {
            numberOfNegative++;
        }
    }
}
