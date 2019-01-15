package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader reader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String s1 = bufferedReader.readLine();
        String s2 = bufferedReader.readLine();
        String s3 = bufferedReader.readLine();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = Integer.parseInt(s3);
        if (a == b && a == c) {
            System.out.println(a + " " + b + " " + c);
        } else if (a == b) {
            System.out.println(a + " " + b);
        } else if (a == c) {
            System.out.println(a + " " + c);
        } else if (b == c) {
            System.out.println(b + " " + c);
        }
    }
}