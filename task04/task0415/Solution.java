package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String s1 = bufferedReader.readLine();
        String s2 = bufferedReader.readLine();
        String s3 = bufferedReader.readLine();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = Integer.parseInt(s3);
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Треугольник существует.");
        } else {
            System.out.println("Треугольник не существует.");
        }
    }
}