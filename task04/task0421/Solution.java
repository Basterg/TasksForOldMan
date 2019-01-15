package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Reader reader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String s1 = bufferedReader.readLine();
        String s2 = bufferedReader.readLine();
        if (s1.equals(s2)) {
            System.out.println("Имена идентичны");
        } else if (s1.length() == s2.length()) {
            System.out.println("Длины имен равны");
        }
    }
}
